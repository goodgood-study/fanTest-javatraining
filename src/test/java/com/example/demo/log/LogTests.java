package com.example.demo.log;

import org.junit.Test;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/**
 * @Author: FAN
 * @Description:TODO
 * @Date: Create in 10:10 2018/8/1
 * @Modify By:
 **/
public class LogTests {
    private static org.slf4j.Logger logger = LoggerFactory.getLogger(LogTests.class);
    @Test
    public void testLogger(){
        logger.error("error");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");
    }
}
