package br.com.bb.infrastructure.persistence.translate;

/**
 * Converter interface.
 * */
public interface Translate <I,O> {
	
	/**
	 * Convert In to Out
	 * */
	O convert(I in);
}
