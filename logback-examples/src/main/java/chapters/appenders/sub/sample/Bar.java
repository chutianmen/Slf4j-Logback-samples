package chapters.appenders.sub.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bar {

	Logger logger = LoggerFactory.getLogger(Bar.class);
	
	public String toString() {
		return "test 123";
	}
	
	public void createLoggingRequest() {
		subMethodToCreateRuquest();
	}
	
	// 这是为了打印多行的堆栈信息
	private void subMethodToCreateRuquest() {
		logger.error("error-level request", new Exception("test exception"));
	}
}
