package br.com.bb.domain.model.exception;

/**
 * Excecao utilizada para qnd atributo for invalido.
 * @author sgrando
 * @since 25/06/2019
 * */
public class InvalidAttributeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4275352812715243932L;

	public InvalidAttributeException() {}
	
	public InvalidAttributeException(final String message) {
		super(message);
	}
	
}
