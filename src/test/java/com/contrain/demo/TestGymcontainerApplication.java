package com.contrain.demo;

import org.springframework.boot.SpringApplication;

public class TestGymcontainerApplication {

	public static void main(String[] args) {
		SpringApplication.from(GymcontainerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
