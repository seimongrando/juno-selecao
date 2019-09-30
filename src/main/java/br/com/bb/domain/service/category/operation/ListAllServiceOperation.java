package br.com.bb.domain.service.category.operation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.bb.domain.model.category.Category;
import br.com.bb.domain.model.category.repository.CategoryRepository;
import br.com.bb.domain.model.exception.CategoryNotRegisteredException;
import br.com.bb.domain.service.ServiceOperation;

/**
 * Componente responsavel por validar listar todas as categorias
 * @author sgrando
 * @since 24/06/2019
 * */
@Component
public class ListAllServiceOperation
	implements ServiceOperation<Void, List<Category>> {

	/**
	 * {@link CategoryRepository}
	 * */
	@Autowired
	private CategoryRepository repository;
	
	/**
	 * {@inheritDoc}
	 * */
	public List<Category> executeOperation(Void in) {
		List<Category> categories = repository.listAll();
		if (categories == null || categories.isEmpty()) {
			throw new CategoryNotRegisteredException();
		}
		return categories;
	}

}
