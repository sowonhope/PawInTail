package com.pawintail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class HomeController {
		
		@GetMapping({"/","/home"})
		public String Home() {
			 System.out.println("homelist......");
			return "home";
		}
		
	}


