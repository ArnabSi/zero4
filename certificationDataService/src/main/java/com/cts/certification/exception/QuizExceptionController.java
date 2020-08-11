package com.cts.certification.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class QuizExceptionController {
	@ExceptionHandler(value = QuizNotfoundException.class)
	public ResponseEntity<Object> exception(QuizNotfoundException exception) {
		return new ResponseEntity<>("Quiz not found", HttpStatus.NOT_FOUND);
	}
}