package com.cts.certification.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.certification.model.QuizQuestion;

/**
 * @author Sagar.Senapati
 *
 */
@Repository("certificationQuizRepoNew")
public interface CertificationQuizRepoNew extends CrudRepository<QuizQuestion, Long>{
	
}
