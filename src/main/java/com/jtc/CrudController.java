package com.jtc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CrudController {
	@GetMapping
	@ResponseBody
	public String HealthCheck() {
		return "All are working fine";
	}
}
