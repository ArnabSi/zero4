package com.cts.certification.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.certification.model.Quiz;
import com.cts.certification.service.CertificationQuizService;

/**
 * @author sudipta.sengupta
 *
 */
@RestController
public class CertificationQuizController {
	
	@Autowired
	private CertificationQuizService certificationQuizService;
	
	/**
	 * @return
	 */
	@GetMapping(path="/quizdetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Quiz> getQuizDetails(){
		return certificationQuizService.getQuizDetails();
	}

}
