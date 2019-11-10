package br.ufal.ic.testingtools.stack;

public class UnderflowStackException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UnderflowStackException(String message) {
		super(message);
	}

}
