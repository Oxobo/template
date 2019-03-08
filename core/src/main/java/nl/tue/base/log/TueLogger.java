package nl.tue.base.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TueLogger {
    public  Logger log;

    public TueLogger(Class clazz){
        this.log = LoggerFactory.getLogger(clazz);
    }
}

