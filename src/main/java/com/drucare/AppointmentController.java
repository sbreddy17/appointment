package com.drucare;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentController {
	
	@GetMapping()
	public String welcome() {
		return "Welcome to appointment vresion one";
	}

}
