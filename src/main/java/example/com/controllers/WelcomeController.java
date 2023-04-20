package example.com.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/")
	public String getCategories() {
		return "Hello World from 'spring-boot-helloworld-image' ";
	}
}