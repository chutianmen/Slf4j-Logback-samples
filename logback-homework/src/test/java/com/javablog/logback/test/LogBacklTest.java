package com.javablog.logback.test;

import com.javablog.logback.ReceiveLog;
import com.javablog.logback.SpringBootMain;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBootMain.class)
@WebAppConfiguration
public class LogBacklTest {
    private final static Logger log = LoggerFactory.getLogger(LogBacklTest.class);

    @Test
    public void platfromIdTest() {
        for (int i=0;i<100000;i++) {
            log.debug("debug level testdebug level testdebug level testdebug level testdebug level " +
                    "testdebug level testdebug level testdebug level testdebug level testdebug level " +
                    "testdebug level testdebug level testdebug level testdebug level testdebug level test");
        }
        for (int i=0;i<100000;i++) {
            log.info("info level testinfo level testinfo level testinfo level testinfo level testinfo " +
                    "level testinfo level testinfo level testinfo level testinfo level testinfo level " +
                    "testinfo level testinfo level testinfo level testinfo level testinfo level test");
        }
        for (int i=0;i<100000;i++) {
            log.warn("warn level testwarn level testwarn level testwarn level testwarn level testwarn " +
                    "level testwarn level testwarn level testwarn level testwarn level testwarn level " +
                    "testwarn level testwarn level testwarn level testwarn level testwarn level testwarn " +
                    "level testwarn level testwarn level testwarn level testwarn level testwarn level testwarn" +
                    " level testwarn level testwarn level test");
        }
        for (int i=0;i<100000;i++) {
            log.error("error level testerror level testerror level testerror level testerror level testerror " +
                    "level testerror level testerror level testerror level testerror level testerror level testerror" +
                    " level testerror level testerror level testerror level test");
        }
        for (int i=0;i<1000;i++) {
            ReceiveInfo info =new ReceiveInfo();
            info.setIp("127.1.1.0");
            String userName = "name" +i;
            info.setUserName(userName);
            String pwd = "pwd" +i;
            info.setPwd(pwd);
            info.setMsg("SpringBoot先于LogBack加载");
            ReceiveLog.logger.info(info.toString());
        }
    }

}