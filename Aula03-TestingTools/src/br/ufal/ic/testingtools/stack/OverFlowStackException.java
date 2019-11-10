package br.ufal.ic.testingtools.stack;

public class OverFlowStackException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public OverFlowStackException(String message) {
		super(message);
	}

}