package chapters.configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.util.StatusPrinter;

public class MyApp3 {

	private static final Logger LOGGER = LoggerFactory.getLogger(MyApp3.class);
	
	public static void main(String[] args) {
		LoggerContext context = (LoggerContext)LoggerFactory.getILoggerFactory();
		JoranConfigurator joranConfigurator = new JoranConfigurator();
		joranConfigurator.setContext(context);
		context.reset();
		try {
			String path = System.getProperty("user.dir") + "\\src\\main\\resources/variableSubstitution3.xml";
//			String path = System.getProperty("user.dir") + "\\src\\main\\resources/sample2.xml";
//			String path = System.getProperty("user.dir") + "\\src\\main\\resources\\sample3.xml";

			joranConfigurator.doConfigure(path);
		} catch (JoranException e) {
			e.printStackTrace();
		}
		StatusPrinter.printInCaseOfErrorsOrWarnings(context);
		LOGGER.info("Entering application");
		
		Foo foo = new Foo();
		foo.doIt();
		LOGGER.info("Exiting application");
	}
}
