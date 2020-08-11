package com.cts.certification.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * @author sudipta.sengupta
 *
 */
@Entity
@Table(name="T_ANSWER_OPTIONS")
public class AnswerOptions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "answer_option_one", nullable = false)
	private String answerOptionOne;
	
	@Column(name = "answer_option_two", nullable = false)
	private String answerOptionTwo;
	
	@Column(name = "answer_option_three", nullable = false)
	private String answerOptionThree;
	
	@Column(name = "answer_option_four", nullable = false)
	private String answerOptionFour;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "question_id", nullable = false)
	@JsonBackReference(value = "options")
	private Question question;

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
	 * @return the answerOptionOne
	 */
	public String getAnswerOptionOne() {
		return answerOptionOne;
	}

	/**
	 * @param answerOptionOne the answerOptionOne to set
	 */
	public void setAnswerOptionOne(String answerOptionOne) {
		this.answerOptionOne = answerOptionOne;
	}

	/**
	 * @return the answerOptionTwo
	 */
	public String getAnswerOptionTwo() {
		return answerOptionTwo;
	}

	/**
	 * @param answerOptionTwo the answerOptionTwo to set
	 */
	public void setAnswerOptionTwo(String answerOptionTwo) {
		this.answerOptionTwo = answerOptionTwo;
	}

	/**
	 * @return the answerOptionThree
	 */
	public String getAnswerOptionThree() {
		return answerOptionThree;
	}

	/**
	 * @param answerOptionThree the answerOptionThree to set
	 */
	public void setAnswerOptionThree(String answerOptionThree) {
		this.answerOptionThree = answerOptionThree;
	}

	/**
	 * @return the answerOptionFour
	 */
	public String getAnswerOptionFour() {
		return answerOptionFour;
	}

	/**
	 * @param answerOptionFour the answerOptionFour to set
	 */
	public void setAnswerOptionFour(String answerOptionFour) {
		this.answerOptionFour = answerOptionFour;
	}

	/**
	 * @return the question
	 */
	public Question getQuestion() {
		return question;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(Question question) {
		this.question = question;
	}

}
