package org.sofka.software.utilities.abstracts;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class MyprintAbstract {

    private static final Logger logger = Logger.getLogger(MyprintAbstract.class.getName());

    private  static final String SEPARATOR = "\n---------------------------------\n";

    protected MyprintAbstract() {
        
    }

    public void makeLog(String order,Object[] message){
        logger.log( Level.INFO, order, message);
    }
    public void log(String message){
        logger.log(
                Level.INFO,
                "{0}" 
                   + "{1}"
                   + "{0}",
                new Object[] {SEPARATOR, message});
    }

    public void logName(String name, String message){
        logger.log(
                Level.INFO,
                "{0}"
                        + "{1} {2}"
                        + "{0}",
                new Object[] {SEPARATOR, name, message});
    }
}
