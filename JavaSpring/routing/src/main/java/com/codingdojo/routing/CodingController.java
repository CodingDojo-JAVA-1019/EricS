package com.codingdojo.routing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {
	@RequestMapping("")
	public String hello() {
		return "hello coding dojo!";
	}
	@RequestMapping("/python")
	public String python() {
		return "python/django was cool!";
	}
	@RequestMapping("/java")
	public String java() {
		return "java/spring is neato!";
	}
}
