package com.example.bit.wonders.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

/**
 * Class to use spring application context while running cucumber
 */
@SpringBootTest(classes = MySpringBootApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public abstract class CucumberSpringContextConfiguration {
	private static final Logger LOG = LoggerFactory.getLogger(CucumberSpringContextConfiguration.class);
	
	CucumberSpringContextConfiguration(){
		LOG.info("Spring context loaded");
	}
}