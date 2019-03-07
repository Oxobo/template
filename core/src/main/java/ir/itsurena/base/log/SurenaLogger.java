package ir.itsurena.base.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SurenaLogger {
    public  Logger log;

    public SurenaLogger(Class clazz){
        this.log = LoggerFactory.getLogger(clazz);
    }
}

