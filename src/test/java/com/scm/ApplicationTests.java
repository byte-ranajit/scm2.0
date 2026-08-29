package com.scm;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import errorhandler.GlobalExceptionHandler;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	void contextLoads() {
	}

	@Test
	void globalExceptionHandlerIsRegistered() {
		assertThat(applicationContext.getBeanNamesForType(GlobalExceptionHandler.class)).isNotEmpty();
	}

}
