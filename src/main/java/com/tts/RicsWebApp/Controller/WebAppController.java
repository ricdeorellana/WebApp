package com.tts.RicsWebApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tts.RicsWebApp.model.Quote;
import com.tts.RicsWebApp.repository.QuoteRepository;

@Controller
public class WebAppController {
	@Autowired
	private QuoteRepository quoteRepository;
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	
	@GetMapping("/quote")
	public String quote(Model model) {
		model.addAttribute("quote", new Quote());
		return "request";
	}
	
	@PostMapping("/quote")
	public String quoteEntry(Quote quote, Model model) {
		model.addAttribute("firstName", quote.getFirstName());
		model.addAttribute("lastName", quote.getLastName());
		model.addAttribute("email", quote.getEmail());
		model.addAttribute("phoneNumber", quote.getPhoneNumber());
		quoteRepository.save(quote); 
		
		return "request";
	}
}
