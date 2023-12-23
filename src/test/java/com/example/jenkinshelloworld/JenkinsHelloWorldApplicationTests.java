package com.example.jenkinshelloworld;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JenkinsHelloWorldApplicationTests {

	private static Logger logger = LoggerFactory.getLogger(JenkinsHelloWorldApplicationTests.class);

	@Test 
	public void contextLoads() {
		logger.info("[1] Test case executing...");
		logger.info("[2] Test case executing...");
		assertEquals(true, true);
	}
}
