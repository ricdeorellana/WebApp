package com.tts.RicsWebApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebAppController {

	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
}
