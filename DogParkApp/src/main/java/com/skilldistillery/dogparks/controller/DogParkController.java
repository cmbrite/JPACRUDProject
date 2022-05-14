package com.skilldistillery.dogparks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.dogparks.data.DogParkDAO;
import com.skilldistillery.dogparks.entities.DogPark;

@Controller
public class DogParkController {

	
	@Autowired
	private DogParkDAO dao;
	
	@RequestMapping(path = {"/", "home.do"})
	public String index(Model model) {
		model.addAttribute("DEBUG", dao.findById(1));
		return "index";
	}
	
	@RequestMapping(path={"getPark.do"})
	public String findById(@RequestParam Integer pid, Model model) {
		DogPark park = dao.findById(pid);
		model.addAttribute("dogPark", park);
		return "parks";
	}
		
}
