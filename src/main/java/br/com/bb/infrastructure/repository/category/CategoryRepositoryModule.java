package br.com.bb.infrastructure.repository.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.bb.domain.model.category.Category;
import br.com.bb.domain.model.category.repository.CategoryRepository;
import br.com.bb.infrastructure.persistence.repository.CategoryEntityRepository;
import br.com.bb.infrastructure.persistence.translate.CategoryEntityListToCategory;

/**
 * Modulo responsavel por implementar operacoes expostas pelo modelo.
 * @author sgrando
 * @since 24/06/2019
 * */
@Component
public class CategoryRepositoryModule 
	implements CategoryRepository {

	/**
	 * {@link CategoryEntityRepository}
	 * */
	@Autowired
	private CategoryEntityRepository categoryRepository;

	/**
	 * {@link CategoryEntityListToCategory}
	 * */
	@Autowired
	private CategoryEntityListToCategory categoryEntityListToCategory;
	
	/**
	 * {@inheritDoc}
	 * */
	public List<Category> listAll() {
		return categoryEntityListToCategory.convert(
				categoryRepository.findAll());
	}

	/**
	 * {@inheritDoc}
	 * */
	public boolean categoryExists(final Integer category) {
		return categoryRepository.exists(category);
	}

}
