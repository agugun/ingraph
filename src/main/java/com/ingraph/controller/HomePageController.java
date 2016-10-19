package com.ingraph.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {
	@RequestMapping("/input")
    public String index(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
		return "input";
    }
}
