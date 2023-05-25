package com.example.demo;

import java.io.IOException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class json_controller {
	
	@GetMapping("/home")
	public String home_index()
	{
		return "home";
	}
	@GetMapping("/results")
	public String json(Model model) throws IOException
	{
		model.addAttribute("new_line", new json_class("Companies.txt").getLine());
		return "showfile"; 
	}

}
