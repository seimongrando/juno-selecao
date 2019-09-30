package br.com.bb.domain.service;

/**
 * Command responsavel por executar o fluxo de servico.
 * @author sgrando
 * @since 24/06/2019
 * */
public interface ServiceOperation <I, O> {

	/**
	 * Executa o fluxo da operacao
	 * */
	O executeOperation(final I in);

}