
package ir.itsurena.base.sima.util;

import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

public class SchemaOutputResolverBuilder extends SchemaOutputResolver {


    public StreamResult result;
    public String finalstring;


        @Override
        public Result createOutput(String namespaceUri, String suggestedFileName)
                throws IOException {

            // create new file
            File file = new File(suggestedFileName+".xsd");

            StringWriter outWriter = new StringWriter();

            // create stream result
            result = new StreamResult(outWriter);

            finalstring = outWriter.toString();
            // set system id
            result.setSystemId(file.toURI().toURL().toString());

            // return result
            return result;
        }

}
