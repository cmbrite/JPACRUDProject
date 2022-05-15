package com.skilldistillery.dogparks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	@RequestMapping(path={"list.do"})
	public String listParks(Model model){
		model.addAttribute("dogparks", dao.findAll());
//	  return "WEB-INF/index.jsp";
	   return "dogParkList"; // if using a ViewResolver.
	}
	
	@RequestMapping(path={"getPark.do"})
	public String findById(@RequestParam Integer pid, Model model) {
		DogPark dogPark = dao.findById(pid);
		model.addAttribute("dogpark", dogPark);
		return "parkInfo";
	}
	
	@RequestMapping(path = {"createDogPark.do"})
	public String createDogPark(Model model) {
		return "newDogPark";
	}
	
	@RequestMapping(path="newDogPark.do", method = RequestMethod.POST)
	public String createDogPark(@RequestParam("name") String name, 
			@RequestParam("address") String address, @RequestParam("city") String city, 
			@RequestParam("state") String state, @RequestParam("size") Integer size,
			RedirectAttributes redir) {
		DogPark dogPark = new DogPark();
		dogPark.setName(name);
		dogPark.setAddress(address);
		dogPark.setCity(city);
		dogPark.setState(state);
		dogPark.setSize(size);
		String page;
		DogPark newDogPark = dao.addNewDogPark(dogPark);
		if(newDogPark != null) {
			redir.addFlashAttribute("dogpark", newDogPark);
			page = "success";
		}else {
			page = "unsuccessful";
		}
		
		return page;
	}
		
}
