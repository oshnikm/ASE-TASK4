package reflections;
import org.apache.log4j.Logger;

public class Logging {

	public static void main(String[] args) {
			final Logger logger = Logger.getLogger(Logging.class);
			logger.debug("This is Debug:" + "parameter/exception object");
			logger.info("This is info:" + "parameter/exception object");
			logger.warn("This is warn:" + "parameter/exception object");
			logger.error("This is error:" + "parameter/exception object");
			logger.fatal("This is fatal:" + "parameter/exception object");
		}
}


	


