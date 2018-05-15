package com.ky.lebron.controller;

import javax.ws.rs.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("lbj/")
public class IndexController {
	
	@RequestMapping("index")
	public String getCategoryList(){
		
		
		return "index";
	}
	
	@RequestMapping("index/{id}")
	public String getIndexById(@PathParam(value = "id")String id ){
		
		
		return null;
	}
}
