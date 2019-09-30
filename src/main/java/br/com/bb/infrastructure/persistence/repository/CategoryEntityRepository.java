package br.com.bb.infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bb.infrastructure.persistence.entities.CategoryEntity;

/**
 * Repositorio responsavel por efetuar consultar sobre a Categoria.
 * @author sgrando
 * @since 24/06/2019
 * */
@Repository
public interface CategoryEntityRepository
	extends JpaRepository<CategoryEntity, Integer> {

}
