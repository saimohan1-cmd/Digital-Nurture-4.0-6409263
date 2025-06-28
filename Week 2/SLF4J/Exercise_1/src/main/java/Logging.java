import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Logging {
	private static Logger log = LoggerFactory.getLogger(Logging.class);
	public static void main(String [] args) {
		log.error("Error Message");
		log.warn("Warning Message");
	}
}
