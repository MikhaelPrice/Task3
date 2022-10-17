package com.A1.Task3;

import com.A1.Task3.controllers.MainController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class Task3ApplicationTests {

	@Autowired
	private MainController controller;

	@Test
	void contextLoads() throws Exception{
		assertThat(controller).isNotNull();
	}

}
