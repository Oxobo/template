package nl.tue.base.ruleengine.config;

import nl.tue.base.core.util.string.StringPool;
import org.kie.api.KieBase;
import org.kie.api.KieBaseConfiguration;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class KieBaseConfig {

    private String ruleNameFirst;
    private String ruleNameTwo;
    private boolean status = true;
    private static Map<String, KieBase> kieBaseCache;
    private final String KIE_BASE_CACHE_NAME = "KIE_BASE_CACHE_NAME";
    private final String BASE_DIRECTORY = "\\rules";
    private final String DRL_DIRECTORY = "src/main/resources";
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private String inMemoryDrlFileName = StringPool.BLANK;
    private String content = StringPool.BLANK ;


    static {
        kieBaseCache = new HashMap<>();
    }

    protected synchronized KieSession getSession() {
        KieSession kieSession = null;

        try {
            if (status) {
                File[] files = getListFiles(getPath(BASE_DIRECTORY));
                KieServices ks = KieServices.Factory.get() ;
                KieFileSystem kfs = ks.newKieFileSystem() ;

                for (int i = 0 ; i < files.length ;i++) {
                    ruleNameFirst = BASE_DIRECTORY + "\\" +  files[i].getName();
                    ruleNameTwo = ruleNameFirst.replaceAll("\\\\","/");
                    content = new String(Files.readAllBytes(Paths.get(getPath(ruleNameFirst))), Charset.forName("UTF-8"));
                    inMemoryDrlFileName =  DRL_DIRECTORY + ruleNameTwo;
                    kfs.write(inMemoryDrlFileName, ks.getResources().newReaderResource(new StringReader(content)).setResourceType(ResourceType.DRL));
                }
                KieBuilder kieBuilder = ks.newKieBuilder(kfs).buildAll();
                KieContainer kContainer = ks.newKieContainer(kieBuilder.getKieModule().getReleaseId());
                KieBaseConfiguration kbconf = ks.newKieBaseConfiguration();
                KieBase kbase = kContainer.newKieBase(kbconf);
                kieSession = kbase.newKieSession();
                kieBaseCache.put(KIE_BASE_CACHE_NAME , kbase);
                log.warn("=====  Configure kbase  ===== " + kieSession.getKieBase());
                status = false;
            } else {
                kieSession = kieBaseCache.get( KIE_BASE_CACHE_NAME ).newKieSession();
                log.warn("=====  Loaded Configure from kbase ===== " + kieSession.getKieBase());
            }
        } catch (IOException t) {
            log.error("IO exception in getMessage method");
        }
        return kieSession;
    }

    public void reload() {
        if (!status)
            status = true;
    }

    public boolean getStatus() {
        return status;
    }

    private File[] getListFiles(String directoryName) {
        if (!directoryName.equals(StringPool.BLANK) && directoryName != null){
            return new File(directoryName).listFiles();
        }else return new File[0];
    }

    private String getPath(String localPath){
        URL url = getClass().getProtectionDomain().getCodeSource().getLocation();
        File file = null;
        try {
            file = new File(url.toURI());
        } catch (URISyntaxException e) {
            log.error("=====  URI syntax exception in getPath method  ===== ");
        }
        return file.getPath()+localPath;
    }
}



