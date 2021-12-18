package com.log4jExample.log4jExample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
 
public class Log4jExample {
    private static final Logger logger = LogManager.getLogger("HelloWorld");
    public static void main(String[] args) {

        logger.info("Hello, World!");
        logger.debug("Hello, World!");
        logger.error("Hello, World!");
    }
}
