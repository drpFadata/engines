package com.engines.engines;

import org.springframework.boot.SpringApplication;

public class TestEnginesApplication {

	public static void main(String[] args) {
		SpringApplication.from(EnginesApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
