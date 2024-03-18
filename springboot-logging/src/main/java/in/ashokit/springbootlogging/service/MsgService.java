package in.ashokit.springbootlogging.service;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MsgService {
	
	private Logger logger = LoggerFactory.getLogger(MsgService.class);

	public String getWelcomeMsg() {

		logger.info("getWelcomeMsg() - started...");

		String msg = "Welcome to Ashok IT";

		logger.info("getWelcomeMsg() - ended.... here");

		return msg;
	}

}
