package com.jungnanum.crawling.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

// import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

// @RunWith(SpringRunner.class)
// @WebMvcTest(controllers = MainController.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MainControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void Hello_리턴() throws Exception {
		String hello = "hello";

		mockMvc.perform(get("/hello"))
			.andExpect(status().isOk())
			.andExpect(content().string(hello));
	}
}
