package chapters.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParasLog {
    private static final Logger logger = LoggerFactory.getLogger(ParasLog.class);

    public static void main(String[] args) {
        int i = 1;
        Object[] entry = {1,2,3};
        Object[] oldEntry = {4,5,6};
        logger.debug("Entry number: " + i + " is " + String.valueOf(entry[i]));
        if(logger.isDebugEnabled()) {
            logger.debug("Entry number: " + i + " is " + String.valueOf(entry[i]));
        }
        SomeObject entryBean = new SomeObject();
        logger.debug("The entry is {}", entryBean);

        logger.debug("The new entry is " + entryBean + ".");
        logger.debug("The new entry is {}", entryBean);

        logger.debug("The new entry is {}, It replaces {}.", entry, oldEntry);

        Object[] paramArray = {"newVal", "below", "above"};
        logger.debug("Value {} was inserted between {} and {}.", paramArray);
    }
}
