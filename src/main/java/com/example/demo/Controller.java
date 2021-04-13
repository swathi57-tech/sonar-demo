package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("sample")
	public String display()
	{
		String s = "" + 123;                // inefficient

		return s;
		
	}

}
