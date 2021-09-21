package com.pb.calculadora.exceptions;

public class UndefinedConcentrationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UndefinedConcentrationException(String mensagem) {
		super(mensagem);
	}

}