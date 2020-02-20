package chapters.appenders;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import chapters.appenders.sub.sample.Bar;
public class ConfigurationTester {

	public static void main(String[] args) throws InterruptedException {
		Logger logger = LoggerFactory.getLogger(ConfigurationTester.class);
		LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
		try {
			JoranConfigurator configurator = new JoranConfigurator();
			configurator.setContext(lc);
			lc.reset();
//			String path = System.getProperty("user.dir") + "\\src\\main\\resources\\logback-Console.xml";
//			String path = System.getProperty("user.dir") + "\\src\\main\\resources\\logback-fileAppender.xml";
//			String path = System.getProperty("user.dir") + "\\src\\main\\resources\\logback-timestamp.xml";
			String path = System.getProperty("user.dir") + "\\src\\main\\resources\\logback-RollingTimeBased.xml";
			configurator.doConfigure(path);
		} catch (JoranException je) {
			je.printStackTrace();
		}
		logger.debug("**Hello {}", new Bar());
		MDC.put("testKey", "testValueFromMDC");
		MDC.put("testKey2", "value2");
		
		for (int i = 0; i < 10; i++) {
			logger.debug("logging statement {}", i);
			Thread.sleep(100);
		}
		Bar bar = new Bar();
		bar.createLoggingRequest();
	}
}
