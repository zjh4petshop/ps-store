package com.zjh.psstore.controller;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@ControllerAdvice
public class OrderApiAdvice {

	@ExceptionHandler(value = {EntityNotFoundException.class})
	public ResponseEntity<Void> handleNotFoundException() {
		return ResponseEntity.notFound().build();
	}
}
