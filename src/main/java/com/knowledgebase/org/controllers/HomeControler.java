package com.knowledgebase.org.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControler {
	
	@RequestMapping(value = "/")
	public String indexPage(Model model){
		model.addAttribute("name", "world");
        return "index";
	}
}
