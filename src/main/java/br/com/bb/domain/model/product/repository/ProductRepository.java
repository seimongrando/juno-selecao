package br.com.bb.domain.model.product.repository;

import java.util.List;

import br.com.bb.domain.model.product.Product;

/**
 * Interface responsavel por mapear todas as operacoes externas ao dominio de produto
 * @author sgrando
 * @since 24/06/2019
 * */
public interface ProductRepository {

	/**
	 * Metodo responsavel por recuperar todos os produtos de uma determinada categoria.
	 * @param category {@link Integer}
	 * @return {@link List of {@link Product}
	 * */
	List<Product> listProductsByCategory(final Integer category);
	
	
}
