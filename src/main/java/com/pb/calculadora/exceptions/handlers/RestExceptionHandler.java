package com.pb.calculadora.exceptions.handlers;

import com.pb.calculadora.dto.DefaultErrorDto;
import com.pb.calculadora.exceptions.RecordNotFoundException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;


@ControllerAdvice
public class RestExceptionHandler {

	public static final String CONTENT_TYPE = "Content-Type";
	private static final String X_MESSAGE_API_HEADER_NAME = "x-apimessage";

	@ExceptionHandler({RecordNotFoundException.class})
	public final ResponseEntity<Object> handleDominioNotFoundExceptions(RecordNotFoundException ex, WebRequest request) {
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add(CONTENT_TYPE, request.getHeader(HttpHeaders.CONTENT_TYPE));
		final DefaultErrorDto defaultError = new DefaultErrorDto();    
		defaultError.setErrorMessage(ex.getMessage());
		responseHeaders.add(X_MESSAGE_API_HEADER_NAME, defaultError.getErrorMessage());
		return new ResponseEntity<>(defaultError, responseHeaders, HttpStatus.NOT_FOUND);
	}

}
