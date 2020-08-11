package com.cts.certification.model;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author sudipta.sengupta
 *
 */
@Entity
@Table(name="T_QUIZ")
public class Quiz {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "organization", nullable = false)
	private String organization;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "quiz", cascade = CascadeType.ALL)
	@OrderBy("id")
	@JsonManagedReference(value = "questions")
	private Set<Question> questionSet = new LinkedHashSet<Question>();

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the organization
	 */
	public String getOrganization() {
		return organization;
	}

	/**
	 * @param organization the organization to set
	 */
	public void setOrganization(String organization) {
		this.organization = organization;
	}

	/**
	 * @return the questionSet
	 */
	public Set<Question> getQuestionSet() {
		return questionSet;
	}

	/**
	 * @param questionSet the questionSet to set
	 */
	public void setQuestionSet(Set<Question> questionSet) {
		this.questionSet = questionSet;
	}
	

}
