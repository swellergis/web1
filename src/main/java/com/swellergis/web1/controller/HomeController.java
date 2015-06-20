package com.swellergis.web1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({"", "/", "home"})
public class HomeController {
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String getMovie(@PathVariable String name, ModelMap model) {
		model.addAttribute("home", name);
		return "home";
	}
	@RequestMapping(method = RequestMethod.GET)
	public String getDefaultMovie(ModelMap model) {
		model.addAttribute("home", "this is default home");
		return "home";
	}

}
