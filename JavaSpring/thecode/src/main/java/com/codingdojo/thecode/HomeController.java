package com.codingdojo.thecode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	
	private Boolean isCorrectCode(String secretCode) {
		return secretCode.equals("bushido");
	}
		
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/theCode", method=RequestMethod.POST)
	public String login(@RequestParam(value="secretCode") String secretCode, Model model, RedirectAttributes redirectAttributes) {
		if(isCorrectCode(secretCode)) {
			return "redirect:/code";
		}
		redirectAttributes.addFlashAttribute("error", "you must train harder!");
		return "redirect:/";
	}

	
	@RequestMapping("code")
	public String code() {
		return "code.jsp";
	}
}
