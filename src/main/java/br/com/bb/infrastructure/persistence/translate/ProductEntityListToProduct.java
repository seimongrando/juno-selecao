package br.com.bb.infrastructure.persistence.translate;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import br.com.bb.domain.model.category.Category;
import br.com.bb.domain.model.product.Product;
import br.com.bb.infrastructure.persistence.entities.CategoryEntity;
import br.com.bb.infrastructure.persistence.entities.ProductEntity;

/**
 * Componente responsavel por converter entidade em objeto de dominio.
 * @author sgrando
 * @since 25/06/2019
 * */
@Component
public class ProductEntityListToProduct
	implements Translate<List<ProductEntity>, List<Product>> {

	/**
	 * {@inheritDoc}
	 * */
	public List<Product> convert(
			final List<ProductEntity> in) {
		if (in == null || in.isEmpty()) {
			return Collections.emptyList();
		}
		// Converte lista de entidade em objeto de dominio
		return in.stream()
				.map(entity -> 
					new Product.Builder(
								extractCategory(entity.getCategory()))
							.withIdentifier(entity.getId())
							.withName(entity.getName())					
						.build())
				.collect(Collectors.toList());
		
	}
	
	public Category extractCategory(final CategoryEntity entity) {
		return new Category.Builder()
						.withIdentifier(entity.getId())
						.withName(entity.getName())
					.build();
	}

}
