package com.jtc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CrudController {
	@GetMapping("/one")
	@ResponseBody
	public String HealthCheck1() {
		return "All are working fine1";
	}

	@GetMapping("/two")
	@ResponseBody
	public String HealthCheck2() {
		return "All are working fine2";
	}
	
	@GetMapping("/three")
	@ResponseBody
	public String HealthCheck3() {
		return "All are working fine3";
	}
	
}
