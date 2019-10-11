package com.codingdojo.displayDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;
import java.util.date;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String currentDate(Model model) {
		Date da = new Date();
		model.addAttribute("da", "cDate");
		return "date.jsp";
	}
	@RequestMapping("/time") 
	public String currentTime(Model model) {
		Time ti = new Time();
		model.addAttribute("cTime", "ti");
		return "time.jsp";
	}
}


//how to do java.util.date and pass it through?
//do i pass it through to .jsp or .html?
//if its .jsp, how do I link CSS and JS?
//if its .html, how do I pass through data from controller?