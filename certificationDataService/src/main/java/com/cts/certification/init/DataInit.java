package com.cts.certification.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.cts.certification.model.AnswerOptions;
import com.cts.certification.model.Question;
import com.cts.certification.model.Quiz;
import com.cts.certification.repository.CertificationQuizRepo;

/**
 * @author sudipta.sengupta
 *
 */
@Component
public class DataInit implements ApplicationRunner {
	
	@Autowired
	private CertificationQuizRepo certificationQuizRepo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		long count = certificationQuizRepo.count();
		if(count == 0) {
			Quiz quiz = getQuizDetails();
			certificationQuizRepo.save(quiz);
		}
	}

	private Quiz getQuizDetails() {
		Quiz quiz = new Quiz();
		quiz.setOrganization("ONGC");
		quiz.getQuestionSet().add(getQuestion(quiz));
		return quiz;
	}

	private Question getQuestion(Quiz quiz) {
		Question question = new Question();
		question.setQuestionString("What is the normal body temperature?");
		question.setCorrectAnswer("98.4");
		question.setAnswerOptions(getAnswerOptions(question));
		question.setQuiz(quiz);
		return question;
	}

	private AnswerOptions getAnswerOptions(Question question) {
		AnswerOptions answerOptions = new AnswerOptions();
		answerOptions.setAnswerOptionOne("96.4");
		answerOptions.setAnswerOptionTwo("97.4");
		answerOptions.setAnswerOptionThree("98.4");
		answerOptions.setAnswerOptionFour("99.4");
		answerOptions.setQuestion(question);
		return answerOptions;
	}

}
