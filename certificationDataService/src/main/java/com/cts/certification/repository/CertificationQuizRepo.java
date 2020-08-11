package com.cts.certification.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.certification.model.Quiz;

/**
 * @author sudipta.sengupta
 *
 */
@Repository("certificationQuizRepo")
public interface CertificationQuizRepo extends CrudRepository<Quiz, Long>{
	
}
