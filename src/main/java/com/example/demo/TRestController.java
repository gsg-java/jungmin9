package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TRestController {
	
	@GetMapping("/rest")
	public String rest() {
		return "test rest";
	}

}
