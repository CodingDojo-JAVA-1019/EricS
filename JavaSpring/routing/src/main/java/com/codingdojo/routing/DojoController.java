package com.codingdojo.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dojo")
public class DojoController {
	@RequestMapping("")
	public String dojo() {
		return "the dojo is awesome!";
	}
	@RequestMapping("/burbank-dojo")
	public String burbank() {
		return "Burbank Dojo is located in Southern California";
	}
	@RequestMapping("/san-jose")
	public String sj() {
		return "SJ dojo is the headquarters";
	}
}
