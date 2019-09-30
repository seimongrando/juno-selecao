package br.com.bb.infrastructure.persistence.translate;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import br.com.bb.domain.model.category.Category;
import br.com.bb.infrastructure.persistence.entities.CategoryEntity;

/**
 * Componente responsavel por converter entidade em objeto de dominio.
 * @author sgrando
 * @since 24/06/2019
 * */
@Component
public class CategoryEntityListToCategory
	implements Translate<List<CategoryEntity>, List<Category>> {

	/**
	 * {@inheritDoc}
	 * */
	public List<Category> convert(
			final List<CategoryEntity> in) {
		if (in == null || in.isEmpty()) {
			return Collections.emptyList();
		}
		// Converte lista de entidade em objeto de dominio
		return in.stream()
				.map(entity -> 
					new Category.Builder()
							.withIdentifier(entity.getId())
							.withName(entity.getName())
						.build())
				.collect(Collectors.toList());
		
	}

}
