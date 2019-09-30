package br.com.bb.infrastructure.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Classe responsavel por mapear tabela CATEGORY.
 * 
 * @author sgrando
 * @since 24/06/2019
 * */
@Entity
@Table(name = "CATEGORY")
public class CategoryEntity {

	/**
	 * {@link Integer} - id - gerado pela sequence CATEGORY_SEQUENCE
	 * */
	@Id
    @GeneratedValue(generator = "CATEGORY_SEQUENCE_GENERATOR", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "CATEGORY_SEQUENCE_GENERATOR", sequenceName = "CATEGORY_SEQUENCE", allocationSize = 1, initialValue = 1)
    @Column(name = "ID")
    private Integer id;
	
	/**
	 * {@link String} - name
	 * */
    @Column(name = "NAME")
    private String name;

    /**
     * Construtor Publico
     * */
    public CategoryEntity(){}

    /**
     * Construtor Publico com id
     * @param id {@link Integer}
     * */
    public CategoryEntity(final Integer id) {
    	this.id = id;
    }
    
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(final Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

}
