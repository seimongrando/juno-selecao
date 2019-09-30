package br.com.bb.infrastructure.repository.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.bb.domain.model.product.Product;
import br.com.bb.domain.model.product.repository.ProductRepository;
import br.com.bb.infrastructure.persistence.entities.CategoryEntity;
import br.com.bb.infrastructure.persistence.repository.ProductEntityRepository;
import br.com.bb.infrastructure.persistence.translate.ProductEntityListToProduct;

/**
 * Modulo responsavel por implementar operacoes expostas pelo modelo.
 * @author sgrando
 * @since 24/06/2019
 * */
@Component
public class ProductRepositoryModule
	implements ProductRepository {

	/**
	 * {@link ProductEntityRepository}
	 * */
	@Autowired
	private ProductEntityRepository productEntityRepository;
	
	/**
	 * {@link ProductEntityListToProduct}
	 * */
	@Autowired
	private ProductEntityListToProduct productEntityListToProduct;
	
	/**
	 * {@inheritDoc}
	 * */
	public List<Product> listProductsByCategory(final Integer category) {
		return productEntityListToProduct.convert(
				productEntityRepository.findAllByCategory(new CategoryEntity(category)));
	}

}
