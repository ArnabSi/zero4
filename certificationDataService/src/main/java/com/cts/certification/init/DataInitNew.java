/**
 * 
 */
package com.cts.certification.init;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.cts.certification.model.Answers;
import com.cts.certification.model.QuizQuestion;
import com.cts.certification.repository.CertificationQuizRepoNew;

/**
 * @author sagar.senapati
 *
 */
@Component
public class DataInitNew implements ApplicationRunner {

	@Autowired
	private CertificationQuizRepoNew certificationQuizRepoNew;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		long count = certificationQuizRepoNew.count();
		if (count == 0) {
			QuizQuestion quizQuestion1 = getQuizDetails1();
			QuizQuestion quizQuestion2 = getQuizDetails2();
			QuizQuestion quizQuestion3 = getQuizDetails3();
			QuizQuestion quizQuestion4 = getQuizDetails4();
			QuizQuestion quizQuestion5 = getQuizDetails5();
			certificationQuizRepoNew.save(quizQuestion1);
			certificationQuizRepoNew.save(quizQuestion2);
			certificationQuizRepoNew.save(quizQuestion3);
			certificationQuizRepoNew.save(quizQuestion4);
			certificationQuizRepoNew.save(quizQuestion5);
		}
	}

	private QuizQuestion getQuizDetails1() {
		QuizQuestion quiz = new QuizQuestion();
		quiz.setQuestionString(
				"What a security personnel should do if some factory employee approaches the gate without wearing a mask?");
		quiz.setAnswerSet(getAnswers1(quiz));
		return quiz;
	}

	private Set<Answers> getAnswers1(QuizQuestion quiz) {
		Set<Answers> answerSet = new LinkedHashSet<Answers>();
		Answers ans = new Answers();
		ans.setType("Novice");
		ans.setContent("Do not check him");
		ans.setQuizquestion(quiz);
		answerSet.add(ans);

		ans = new Answers();
		ans.setType("Intermediate");
		ans.setContent("Check him without any changes in the process");
		ans.setQuizquestion(quiz);
		answerSet.add(ans);

		ans = new Answers();
		ans.setType("Adept");
		ans.setContent("Give him a mask from the store and then check him");
		ans.setQuizquestion(quiz);
		answerSet.add(ans);
		return answerSet;
	}

	private QuizQuestion getQuizDetails2() {
		QuizQuestion quiz = new QuizQuestion();
		quiz.setQuestionString("A factory worker is found to have temperature above normal");
		quiz.setAnswerSet(getAnswers2(quiz));
		return quiz;
	}

	private Set<Answers> getAnswers2(QuizQuestion quiz) {
		Set<Answers> answerSet = new LinkedHashSet<Answers>();
		Answers ans = new Answers();
		ans.setType("Novice");
		ans.setContent("Let him through");
		ans.setQuizquestion(quiz);
		answerSet.add(ans);

		ans = new Answers();
		ans.setType("Intermediate");
		ans.setContent("Stop him from entering");
		ans.setQuizquestion(quiz);
		answerSet.add(ans);

		ans = new Answers();
		ans.setType("Adept");
		ans.setContent("Stop him from entering and let the management and the health cell know");
		ans.setQuizquestion(quiz);
		answerSet.add(ans);
		return answerSet;
	}

	private QuizQuestion getQuizDetails3() {
		QuizQuestion quiz = new QuizQuestion();
		quiz.setQuestionString("An employee is found to be out of breath and likely to faint, what should you do?");
		quiz.setAnswerSet(getAnswers3(quiz));
		return quiz;
	}

	private Set<Answers> getAnswers3(QuizQuestion quiz) {
		Set<Answers> answerSet = new LinkedHashSet<Answers>();
		Answers ans = new Answers();
		ans.setType("Novice");
		ans.setContent("Call the persons family");
		ans.setQuizquestion(quiz);
		answerSet.add(ans);

		ans = new Answers();
		ans.setType("Intermediate");
		ans.setContent("Report to the health cell");
		ans.setQuizquestion(quiz);
		answerSet.add(ans);

		ans = new Answers();
		ans.setType("Adept");
		ans.setContent(
				"Apply oximeter provided by the company to check oxygen level and report the incident to health cell");
		ans.setQuizquestion(quiz);
		answerSet.add(ans);
		return answerSet;
	}

	private QuizQuestion getQuizDetails4() {
		QuizQuestion quiz = new QuizQuestion();
		quiz.setQuestionString(
				"A security personnel finds that a large group of employees is trying to enter through a gate simultaneously, what should he do?");
		quiz.setAnswerSet(getAnswers4(quiz));
		return quiz;
	}

	private Set<Answers> getAnswers4(QuizQuestion quiz) {
		Set<Answers> answerSet = new LinkedHashSet<Answers>();
		Answers ans = new Answers();
		ans.setType("Novice");
		ans.setContent("Do nothing as nothing wrong is done");
		ans.setQuizquestion(quiz);
		answerSet.add(ans);

		ans = new Answers();
		ans.setType("Intermediate");
		ans.setContent("Stop the employees fully");
		ans.setQuizquestion(quiz);
		answerSet.add(ans);

		ans = new Answers();
		ans.setType("Adept");
		ans.setContent("Ask the employees to enter one by one with maintaining a certain distance");
		ans.setQuizquestion(quiz);
		answerSet.add(ans);
		return answerSet;
	}

	private QuizQuestion getQuizDetails5() {
		QuizQuestion quiz = new QuizQuestion();
		quiz.setQuestionString("A security personnel finds some personal stuff left by some employee lying somewhere?");
		quiz.setAnswerSet(getAnswers5(quiz));
		return quiz;
	}

	private Set<Answers> getAnswers5(QuizQuestion quiz) {
		Set<Answers> answerSet = new LinkedHashSet<Answers>();
		Answers ans = new Answers();
		ans.setType("Novice");
		ans.setContent("Do nothing");
		ans.setQuizquestion(quiz);
		answerSet.add(ans);

		ans = new Answers();
		ans.setType("Intermediate");
		ans.setContent("Pick it and transfer to cloakroom");
		ans.setQuizquestion(quiz);
		answerSet.add(ans);

		ans = new Answers();
		ans.setType("Adept");
		ans.setContent(
				"Transfer it to cloak room after applying basic sanitation techniques and touch it only when wearing gloves");
		ans.setQuizquestion(quiz);
		answerSet.add(ans);
		return answerSet;
	}
}
