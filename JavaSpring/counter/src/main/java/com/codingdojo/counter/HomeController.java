package com.codingdojo.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(HttpSession session) {

		if(session.getAttribute("count") == null) {
			System.out.println("this if statement has run");
			 session.setAttribute("count", 0);
		}
		Integer totalcount = (Integer) session.getAttribute("count");
		System.out.println("before count" + totalcount);
		totalcount++;
		session.setAttribute("count", totalcount);
		System.out.println("after count" + totalcount);
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	 public String index(HttpSession session){
       
//        Integer count = (Integer) session.getAttribute("count");
        return "counter.jsp";
    }
	
	@RequestMapping("/reset")
		public String reset(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}

//counter.jsp not displaying - type not found?
//do i need a javascript static file to count++ ?
//add a destroy session- where?