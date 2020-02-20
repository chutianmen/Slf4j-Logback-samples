package com.javablog.logback.test;

import com.javablog.logback.SpringBootMain;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBootMain.class)
public class LogBacklTest {
    private final static Logger log = LoggerFactory.getLogger(LogBacklTest.class);

    @Test
    public void logbackTest() {
        log.debug("DEBUG级别日志输出。。。。。。");
        log.info("INFO级别日志输出。。。。。。");
        log.warn("WARN级别日志输出。。。。。。");
    }

}