package com.first.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MySpringController {

@RequestMapping(value="/first")
public String WelcomeMethod(){
	try{		
	}	
	catch(Exception ex){		
	ex.printStackTrace();
	}
	return "dama/FirstPage";
}
	
	
}
