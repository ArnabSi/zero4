package com.cts.certification.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.certification.model.Quiz;
import com.cts.certification.model.QuizQuestion;
import com.cts.certification.service.CertificationQuizService;

/**
 * @author sudipta.sengupta
 *
 */
@RestController
@CrossOrigin(origins = "*")
public class CertificationQuizController {
	
	@Autowired
	private CertificationQuizService certificationQuizService;
	
	/**
	 * @return
	 */
	@GetMapping(path= {"/","/quizdetails"}, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Quiz> getQuizDetails(){
		return certificationQuizService.getQuizDetails();
	}
	
	@GetMapping(path= {"/quizdetailsnew"}, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<QuizQuestion> getQuizDetailsNew(){
		return certificationQuizService.getQuizDetailsNew();
	}

}
