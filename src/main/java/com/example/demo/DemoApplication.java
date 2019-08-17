package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}


@Slf4j
@RestController
class HelloResource {

	@GetMapping("/hello/{name}")
	public ResponseEntity<String> sayHello(@PathVariable String name) {
		String greeting = String.format("Hey %s !", name);
		log.info(" Receive param {}", greeting);
		return ResponseEntity.ok(greeting);
	}
}