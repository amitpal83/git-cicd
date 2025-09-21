package com.xyner.gitcicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/students")
	public String getStudent() {
		return "Amit Pal";
	}
	
}
