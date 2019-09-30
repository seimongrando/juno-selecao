package br.com.bb.domain.model.category.repository;

import java.util.List;

import br.com.bb.domain.model.category.Category;

/**
 * Interface responsavel por mapear todas as operacoes externas ao dominio de categorias
 * @author sgrando
 * @since 24/06/2019
 * */
public interface CategoryRepository {

	/**
	 * Metodo responsavel por recuperar todas as categorias.
	 * @return {@link List of {@link Category}
	 * */
	List<Category> listAll();
	
	/**
	 * Metodo responsavel por verificar se categoria existe.
	 * @param category {@link Integer}
	 * @return {@link boolean}
	 * */
	boolean categoryExists(final Integer category);
	
}
