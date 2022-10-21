package tests.log4J;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Log4JTest2 {
    private static Logger logger = LogManager.getLogger(Log4JTest2.class.getName());
    @Test
    public void log4JTest1(){
        logger.info("Log info");
        logger.debug("Log Debug");
        logger.error("Log Error");
        logger.fatal("Log Fatal");
        logger.warn("Log Warn");
    }
}
