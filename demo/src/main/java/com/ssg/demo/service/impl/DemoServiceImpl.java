package com.ssg.demo.service.impl;

import org.springframework.stereotype.Service;

import com.ssg.demo.service.DemoService;

/**
 * @author SUDIPTA
 *
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {

	/**
	 * Get message
	 */
	@Override
	public String getDefaultMessage() {
		return "Demo App says HELLO!";
	}

}
