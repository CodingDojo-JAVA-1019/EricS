package com.codingdojo.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
	
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	 public String index(HttpSession session){
        session.setAttribute("count", 0);
        Integer count = (Integer) session.getAttribute("count");
        return "counter.jsp";
    }
		
}

//counter.jsp not displaying - type not found?
//do i need a javascript static file to count++ ?
//add a destroy session- where?