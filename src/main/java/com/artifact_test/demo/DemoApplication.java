package com.artifact_test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cherrywork.oneapp.fieldcatalog.controller.LapiController;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EntityScan(basePackages = "com.cherrywork.oneapp.fieldcatalog.*")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


}
