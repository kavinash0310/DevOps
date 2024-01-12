package com.nagarro.DevOpsAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevOpsAssignmentApplication {

	@GetMapping("/")
	public String print(){
		return "Everything is working!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevOpsAssignmentApplication.class, args);
	}

}
