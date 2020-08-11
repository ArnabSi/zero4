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
		quiz.getQuestionSet().add(getQuestion1(quiz));
		quiz.getQuestionSet().add(getQuestion2(quiz));
		quiz.getQuestionSet().add(getQuestion3(quiz));
		quiz.getQuestionSet().add(getQuestion4(quiz));
		quiz.getQuestionSet().add(getQuestion5(quiz));
		quiz.getQuestionSet().add(getQuestion6(quiz));
		quiz.getQuestionSet().add(getQuestion7(quiz));
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
	
	private Question getQuestion1(Quiz quiz) {
		Question question = new Question();
		question.setQuestionString("What other viruses belong to the coronavirus family?");
		question.setCorrectAnswer("SARS and MERS");
		question.setAnswerOptions(getAnswerOptions1(question));
		question.setQuiz(quiz);
		
		return question;
	}

	private AnswerOptions getAnswerOptions1(Question question) {
		AnswerOptions answerOptions = new AnswerOptions();
		answerOptions.setAnswerOptionOne("SARS and influenza");
		answerOptions.setAnswerOptionTwo("SARS and MERS");
		answerOptions.setAnswerOptionThree("SARS and HIV");
		answerOptions.setAnswerOptionFour("MERS and HIV");
		answerOptions.setQuestion(question);
		return answerOptions;
	}
	
	private Question getQuestion2(Quiz quiz) {
		Question question = new Question();
		question.setQuestionString("How many vaccine candidates for COVID-19 have been proposed?");
		question.setCorrectAnswer("120+");
		question.setAnswerOptions(getAnswerOptions2(question));
		question.setQuiz(quiz);
		
		return question;
	}

	private AnswerOptions getAnswerOptions2(Question question) {
		AnswerOptions answerOptions = new AnswerOptions();
		answerOptions.setAnswerOptionOne("25");
		answerOptions.setAnswerOptionTwo("75");
		answerOptions.setAnswerOptionThree("100");
		answerOptions.setAnswerOptionFour("120+");
		answerOptions.setQuestion(question);
		return answerOptions;
	}
	
	private Question getQuestion3(Quiz quiz) {
		Question question = new Question();
		question.setQuestionString("The novel coronavirus responsible for the outbreak is called:");
		question.setCorrectAnswer("SARS-CoV-2");
		question.setAnswerOptions(getAnswerOptions3(question));
		question.setQuiz(quiz);
		
		return question;
	}

	private AnswerOptions getAnswerOptions3(Question question) {
		AnswerOptions answerOptions = new AnswerOptions();
		answerOptions.setAnswerOptionOne("COVID-19");
		answerOptions.setAnswerOptionTwo("SARS-CoV-2");
		answerOptions.setAnswerOptionThree("2019-nCoV");
		answerOptions.setAnswerOptionFour("MERS-CoV-2");
		answerOptions.setQuestion(question);
		return answerOptions;
	}
	
	private Question getQuestion4(Quiz quiz) {
		Question question = new Question();
		question.setQuestionString("How long does the novel coronavirus survive outside the body?");
		question.setCorrectAnswer("Several Hours to Days");
		question.setAnswerOptions(getAnswerOptions4(question));
		question.setQuiz(quiz);
		
		return question;
	}

	private AnswerOptions getAnswerOptions4(Question question) {
		AnswerOptions answerOptions = new AnswerOptions();
		answerOptions.setAnswerOptionOne("A  week in the air and on surfaces");
		answerOptions.setAnswerOptionTwo("Several Hours to Days");
		answerOptions.setAnswerOptionThree("Up to a two and a half weeks");
		answerOptions.setAnswerOptionFour("Months to years");
		answerOptions.setQuestion(question);
		return answerOptions;
	}
	
	private Question getQuestion5(Quiz quiz) {
		Question question = new Question();
		question.setQuestionString("What’s more important for preventing infection?");
		question.setCorrectAnswer("Frequent hand washing");
		question.setAnswerOptions(getAnswerOptions5(question));
		question.setQuiz(quiz);
		
		return question;
	}

	private AnswerOptions getAnswerOptions5(Question question) {
		AnswerOptions answerOptions = new AnswerOptions();
		answerOptions.setAnswerOptionOne("Wearing a face mask");
		answerOptions.setAnswerOptionTwo("Frequent hand washing");
		answerOptions.setAnswerOptionThree("Staying outside");
		answerOptions.setAnswerOptionFour("Remaining Inside always");
		answerOptions.setQuestion(question);
		return answerOptions;
	}
	
	private Question getQuestion6(Quiz quiz) {
		Question question = new Question();
		question.setQuestionString("What is a fomite?");
		question.setCorrectAnswer("A contaminated object or surface");
		question.setAnswerOptions(getAnswerOptions6(question));
		question.setQuiz(quiz);
		
		return question;
	}

	private AnswerOptions getAnswerOptions6(Question question) {
		AnswerOptions answerOptions = new AnswerOptions();
		answerOptions.setAnswerOptionOne("A hospital-grade disinfectant");
		answerOptions.setAnswerOptionTwo("A disease carrier");
		answerOptions.setAnswerOptionThree("An immunity boosting suppliment");
		answerOptions.setAnswerOptionFour("A contaminated object or surface");
		answerOptions.setQuestion(question);
		return answerOptions;
	}
	
	private Question getQuestion7(Quiz quiz) {
		Question question = new Question();
		question.setQuestionString("Who’s at highest risk of developing severe Covid-19 disease?");
		question.setCorrectAnswer("Those with existing medical conditions");
		question.setAnswerOptions(getAnswerOptions7(question));
		question.setQuiz(quiz);
		
		return question;
	}

	private AnswerOptions getAnswerOptions7(Question question) {
		AnswerOptions answerOptions = new AnswerOptions();
		answerOptions.setAnswerOptionOne("Children");
		answerOptions.setAnswerOptionTwo("Pregnant Women");
		answerOptions.setAnswerOptionThree("Those with existing medical conditions");
		answerOptions.setAnswerOptionFour("Adults");
		answerOptions.setQuestion(question);
		return answerOptions;
	}
	
}
