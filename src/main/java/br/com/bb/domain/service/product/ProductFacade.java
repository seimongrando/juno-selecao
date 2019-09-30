package br.com.bb.domain.service.product;

import java.util.List;

import br.com.bb.domain.model.product.Product;

/**
 * Facade responsavel por encpsular e expor todas as operacoes referentes ao produto.
 * @author sgrando
 * @since 24/06/2019
 * */
public interface ProductFacade {

	/**
	 * Lista produtos pelo identificador da categoria.
	 * @param category {@link Integer}
	 * @return {@link List of {@link Product}
	 * */
	List<Product> listProductsByCategory(final Integer category);
	
}
