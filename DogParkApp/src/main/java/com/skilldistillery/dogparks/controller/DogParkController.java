package com.skilldistillery.dogparks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
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
		if(dogPark == null) {
			return "noParkFound";
		}
		return "parkInfo";
	}
	
	@RequestMapping(path = {"createDogPark.do"})
	public String createDogPark(Model model) {
		return "newDogPark";
	}
	
	@RequestMapping(path="newDogPark.do", method = RequestMethod.POST)
	public ModelAndView createDogPark(@RequestParam("name") String name, 
			@RequestParam("address") String address, @RequestParam("city") String city, 
			@RequestParam("state") String state, @RequestParam("size") Integer size, 
			@RequestParam("open") Integer open, @RequestParam("close") Integer close,
			RedirectAttributes redir) {
		ModelAndView mv = new ModelAndView();
		state = state.toUpperCase();
		DogPark dogPark = new DogPark();
		dogPark.setName(name);
		dogPark.setAddress(address);
		dogPark.setCity(city);
		dogPark.setState(state);
		dogPark.setSize(size);
		dogPark.setSize(open);
		dogPark.setSize(close);
		DogPark newDogPark = dao.addNewDogPark(dogPark);
		if(newDogPark != null) {
			mv.addObject("dogpark", dogPark);
			mv.setViewName("parkInfo");
		}else {
			mv.setViewName("unsuccessful");
		}
		return mv;
	}
	
	
	@RequestMapping(path={"deletePark.do"})
	public String deleteDogPark(@RequestParam("deleteId")int id) {
		boolean dogPark = dao.deleteDogPark(id);
		System.out.println(dogPark);
//		model.addAttribute("dogpark", dogPark);
		if(dogPark == true) {
			return "success";
		}else {
		return "unsuccessful";
		}
	}
	
	@RequestMapping(path = {"startEditPark.do"})
	public ModelAndView startEditPark(@RequestParam("editId") String editId) {
		ModelAndView mv = new ModelAndView();
		int id = Integer.parseInt(editId);
		DogPark dogPark = dao.findById(id);
		if (dogPark != null) {
			mv.addObject("dogpark", dogPark);
			mv.setViewName("editPark");
		} else {
			mv.setViewName("unsuccessful");
		}
		return mv;
	}
	
	
	@RequestMapping(path={"editDogPark.do"})
	public ModelAndView editDogPark(@RequestParam("editId")String editId, @RequestParam("name") String name, 
			@RequestParam("address") String address, @RequestParam("city") String city, 
			@RequestParam("state") String state, @RequestParam("size") Integer size,
			@RequestParam("open") Integer open, @RequestParam("close") Integer close) {
		ModelAndView mv = new ModelAndView();
		int id = Integer.parseInt(editId);
		state = state.toUpperCase();
		DogPark dogPark = dao.findById(id);
		
		dogPark.setName(name);
	    dogPark.setAddress(address);
	    dogPark.setCity(city);
	    dogPark.setState(state);
	    dogPark.setSize(size);
	    dogPark.setSize(open);
		dogPark.setSize(close);
	    
	    DogPark editedDogPark = dao.editDogPark(dogPark);
		if(editedDogPark != null) {
			mv.addObject("dogpark", dogPark);
			mv.setViewName("parkInfo");
		}else {
			mv.setViewName("unsuccessful");
		}
		return mv;
	}
}
