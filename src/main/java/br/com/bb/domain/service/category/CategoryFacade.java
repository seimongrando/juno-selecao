package br.com.bb.domain.service.category;

import java.util.List;

import br.com.bb.domain.model.category.Category;

/**
 * Facade responsavel por encpsular e expor todas as operacoes referentes a categoria.
 * @author sgrando
 * @since 24/06/2019
 * */
public interface CategoryFacade {

	/**
	 * Metodo responsavel por listar todas as {@link Category}
	 * @return {@link Category}
	 * */
	List<Category> listAll();
	
}
