package com.cts.certification.service;

import java.util.List;

import com.cts.certification.model.Quiz;
import com.cts.certification.model.QuizQuestion;

/**
 * @author sudipta.sengupta
 *
 */
public interface CertificationQuizService {

	/**
	 * @return
	 */
	List<Quiz> getQuizDetails();

	List<QuizQuestion> getQuizDetailsNew();
}
