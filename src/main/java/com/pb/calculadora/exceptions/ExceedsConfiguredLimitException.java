package com.pb.calculadora.exceptions;

public class ExceedsConfiguredLimitException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ExceedsConfiguredLimitException(String mensagem) {
		super(mensagem);
	}

}