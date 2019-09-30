package br.com.bb.domain.service.product.operation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.bb.domain.model.product.Product;
import br.com.bb.domain.service.product.ProductFacade;

/**
 * Classe de servico responsavel por adicionar controle transacional
 *  e delegar as chamadas para seus devidos componentes.
 * @author sgrando
 * @since 24/06/2019
 * */
@Service
@Transactional
public class ProductService implements ProductFacade {

	/**
	 * {@link ListProductsByCategoryServiceOperation}
	 * */
	@Autowired
	private ListProductsByCategoryServiceOperation listProductsByCategory;
	
	/**
	 * {@inheritDoc}
	 * */
	@Transactional(readOnly = true)
	public List<Product> listProductsByCategory(final Integer category) {
		return listProductsByCategory.executeOperation(category);
	}

}
