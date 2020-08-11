package com.cts.certification.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.certification.model.Quiz;
import com.cts.certification.repository.CertificationQuizRepo;
import com.cts.certification.service.CertificationQuizService;

/**
 * @author sudipta.sengupta
 *
 */
@Service("certificationQuizService")
public class CertificationQuizServiceImpl implements CertificationQuizService {
	
	@Autowired
	private CertificationQuizRepo certificationQuizRepo;

	/**
	 *
	 */
	@Override
	public List<Quiz> getQuizDetails() {
		List<Quiz> quizList = new ArrayList<Quiz>();
		certificationQuizRepo.findAll().forEach(quizList :: add);
		return quizList;
	}

}
