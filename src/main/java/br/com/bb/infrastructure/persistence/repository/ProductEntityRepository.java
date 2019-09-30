package br.com.bb.infrastructure.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bb.infrastructure.persistence.entities.CategoryEntity;
import br.com.bb.infrastructure.persistence.entities.ProductEntity;

/**
 * Repositorio responsavel por efetuar consultar sobre a Categoria.
 * @author sgrando
 * @since 24/06/2019
 * */
@Repository
public interface ProductEntityRepository
	extends JpaRepository<ProductEntity, Integer> {

	/**
	 * Metodo responsavel por listar todos produtos pela categoria.
	 * @param cateogry {@link CategoryEntity}
	 * @return {@link List of {@link ProductEntity}
	 * */
	List<ProductEntity> findAllByCategory(final CategoryEntity category);
	
}
