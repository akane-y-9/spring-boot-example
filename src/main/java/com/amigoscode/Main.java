package com.amigoscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@SpringBootApplication
@RestController //To add @Controller and @ResponseBody together - all the methods in the marked class will return a JSON response

public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
	@GetMapping("/greet")
	public GreetResponse greet(){
		return new GreetResponse("Hello");
	}

	record Person(
			String greet,
			List<String> favProgrammingLanguages,
			Person person
	){


	}

}
