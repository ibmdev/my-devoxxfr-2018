package com.ibm.springboot2_webapplication_initializr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.logging.Level;
import java.util.logging.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot2WebapplicationInitializrApplicationTests {

    Logger jul = Logger.getLogger(Springboot2WebapplicationInitializrApplicationTests.class.getName());

	@Test

	public void contextLoads() {

        jul.log(Level.INFO, "Spring Boot 2 Context Loading");
	}

}
