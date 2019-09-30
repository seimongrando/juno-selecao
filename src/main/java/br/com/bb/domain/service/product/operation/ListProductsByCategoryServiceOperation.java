package br.com.bb.domain.service.product.operation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.bb.domain.model.category.repository.CategoryRepository;
import br.com.bb.domain.model.exception.CategoryNotfoundException;
import br.com.bb.domain.model.exception.ProductNotfoundForCategoryException;
import br.com.bb.domain.model.product.Product;
import br.com.bb.domain.model.product.repository.ProductRepository;
import br.com.bb.domain.service.AbstractServiceOperation;

/**
 * Componente responsavel por listar todos produtos de uma determinada categoria.
 * @author sgrando
 * @since 25/06/2019
 * */
@Component
public class ListProductsByCategoryServiceOperation
	extends AbstractServiceOperation<Integer, List<Product>>{

	/**
	 * {@link CategoryRepository}
	 * */
	@Autowired
	private CategoryRepository categoryRepository;
	
	/**
	 * {@link ProductRepository}
	 * */
	@Autowired
	private ProductRepository productRepository;
	
	/**
	 * {@inheritDoc}
	 * */
	protected void executeBusinessRules(final Integer category) {
		if (category == null || category <= 0 || !categoryRepository.categoryExists(category)) {
			throw new CategoryNotfoundException();
		}
	}

	/**
	 * {@inheritDoc}
	 * */
	protected List<Product> execute(final Integer category) {
		List<Product> products = productRepository.listProductsByCategory(category);
		if (products == null || products.isEmpty()) {
			throw new ProductNotfoundForCategoryException();
		}
		return products;
	}

}
