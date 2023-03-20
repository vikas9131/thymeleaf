package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.stereotype.Controller
public class Controller {

	@GetMapping("/ind")
	public String index(Model model)
	{
		System.out.println("hi.......//././././.");
	ArrayList<String> list=new ArrayList<>();
	
	list.add("Vikas");
	list.add("Rajput");
		model.addAttribute("list", list);
		return "index";
	}
}
