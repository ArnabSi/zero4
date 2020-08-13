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

@Entity
@Table(name = "T_QUIZQUESTION")
public class QuizQuestion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "question_string", nullable = false)
	private String questionString;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "quizquestion", cascade = CascadeType.ALL)
	@OrderBy("id")
	@JsonManagedReference(value = "answers")
	private Set<Answers> answerSet = new LinkedHashSet<Answers>();

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
	 * @return the questionString
	 */
	public String getQuestionString() {
		return questionString;
	}

	/**
	 * @param questionString the questionString to set
	 */
	public void setQuestionString(String questionString) {
		this.questionString = questionString;
	}

	/**
	 * @return the answerSet
	 */
	public Set<Answers> getAnswerSet() {
		return answerSet;
	}

	/**
	 * @param answerSet the answerSet to set
	 */
	public void setAnswerSet(Set<Answers> answerSet) {
		this.answerSet = answerSet;
	}

}
