package com.cts.certification.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author sudipta.sengupta
 *
 */
@Entity
@Table(name="T_QUESTION")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "question_string", nullable = false)
	private String questionString;
	
	@Column(name = "correct_answer", nullable = false)
	private String correctAnswer;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "quiz_id", nullable = false)
	@JsonBackReference(value = "questions")
	private Quiz quiz;
	
	@OneToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL, mappedBy = "question")
	@JsonManagedReference(value = "options")
	private AnswerOptions answerOptions;
	
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
	 * @return the correctAnswer
	 */
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	/**
	 * @param correctAnswer the correctAnswer to set
	 */
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	/**
	 * @return the quiz
	 */
	public Quiz getQuiz() {
		return quiz;
	}
	/**
	 * @param quiz the quiz to set
	 */
	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}
	/**
	 * @return the answerOptions
	 */
	public AnswerOptions getAnswerOptions() {
		return answerOptions;
	}
	/**
	 * @param answerOptions the answerOptions to set
	 */
	public void setAnswerOptions(AnswerOptions answerOptions) {
		this.answerOptions = answerOptions;
	}
	
}
