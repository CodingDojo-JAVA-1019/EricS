package com.codingdojo.displayDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String currentDate(Model model) {
		String formatter = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
		model.addAttribute("date", formatter);
		return "date.jsp";
	}
	@RequestMapping("/time") 
	public String currentTime(Model model) {
		String formatter = new SimpleDateFormat("HH:mm:ss").format(new Date());
		model.addAttribute("time", formatter);
		return "time.jsp";
	}
}


//https://stackabuse.com/how-to-get-current-date-and-time-in-java/