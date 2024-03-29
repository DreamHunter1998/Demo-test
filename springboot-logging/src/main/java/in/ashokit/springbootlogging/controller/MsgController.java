package in.ashokit.springbootlogging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.springbootlogging.service.MsgService;

@RestController
public class MsgController {
	 private Logger log =LoggerFactory.getLogger(MsgController.class);

	@Autowired
	private MsgService msgService;

	@GetMapping("/welcome")
	public String getMsg() {
		log.info("This massge is just for information");
		return msgService.getWelcomeMsg();
	}

}
