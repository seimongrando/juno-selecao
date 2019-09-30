package br.com.bb.domain.service.category.operation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.bb.domain.model.category.Category;
import br.com.bb.domain.service.category.CategoryFacade;

/**
 * Classe de servico responsavel por adicionar controle transacional
 *  e delegar as chamadas para seus devidos componentes.
 * @author sgrando
 * @since 24/06/2019
 * */
@Service
@Transactional
public class CategoryService implements CategoryFacade {

	/**
	 * {@link ListAllServiceOperation}
	 * */
	@Autowired
	private ListAllServiceOperation listAll;
	
	/**
	 * {@inheritDoc}
	 * */
	@Transactional(readOnly = true)
	public List<Category> listAll() {
		return listAll.executeOperation(null);
	}

}
