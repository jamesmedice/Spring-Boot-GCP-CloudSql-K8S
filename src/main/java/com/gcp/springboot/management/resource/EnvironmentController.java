package com.gcp.springboot.management.resource;

import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvironmentController {

	protected Logger logger = Logger.getLogger(EnvironmentController.class.getName());

	@Autowired
	Environment environment;

	@Value("${user_profile}")
	private String profile;

	@RequestMapping(value = "/envVars", method = RequestMethod.GET)
	public Map<String, String> envVars() {
		logger.info("microservice envVars() invoked");
		return System.getenv();
	}

	@RequestMapping(value = "/activeProfiles", method = RequestMethod.GET)
	public String[] activeProfiles() {
		logger.info("microservice activeProfiles() invoked");
		return environment.getActiveProfiles();
	}

	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public String profile() {
		logger.info(profile);
		return profile;
	}

}
