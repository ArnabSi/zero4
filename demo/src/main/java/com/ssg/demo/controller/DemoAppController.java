package com.ssg.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssg.demo.service.DemoService;

/**
 * @author SUDIPTA
 *
 */
@RestController
public class DemoAppController {
	
	@Autowired
	private DemoService demoService;
	
	/**
	 * @return
	 */
	@GetMapping(path = "/default")
	public String getDefaultMessage() {
		return demoService.getDefaultMessage();
	}
	

}
