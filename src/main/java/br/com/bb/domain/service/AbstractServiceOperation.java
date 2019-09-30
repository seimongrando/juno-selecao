package br.com.bb.domain.service;

/**
 * Template Method responsavel por encapsular o fluxo de servicos.
 *  Classe regula e mantem a ordem das execucoes.
 * @author sgrando
 * @since 24/06/2019
 * */
public abstract class AbstractServiceOperation <I, O>
	implements ServiceOperation <I, O> {

	/**
	 * Executa o fluxo da operacao
	 * */
	public O executeOperation(final I in) {
		// Passo 01
		executeBusinessRules(in);
		// Passo 02
		return execute(in);
	}

	/**
	 * Valida regras negociais
	 * */
	protected abstract void executeBusinessRules(final I in);

	/**
	 * Executa operacao
	 * */
	protected abstract O execute(final I in);

}