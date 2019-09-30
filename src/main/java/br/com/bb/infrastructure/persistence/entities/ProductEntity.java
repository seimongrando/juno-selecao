package br.com.bb.infrastructure.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Classe responsavel por mapear tabela PRODUCT.
 * 
 * @author sgrando
 * @since 24/06/2019
 * */
@Entity
@Table(name = "PRODUCT")
public class ProductEntity {

	/**
	 * {@link Integer} - id - gerado pela sequence PRODUCT_SEQUENCE
	 * */
	@Id
    @GeneratedValue(generator = "PRODUCT_SEQUENCE_GENERATOR", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "PRODUCT_SEQUENCE_GENERATOR", sequenceName = "PRODUCT_SEQUENCE", allocationSize = 1, initialValue = 1)
    @Column(name = "ID")
    private Integer id;
	
	/**
	 * {@link String} - name
	 * */
    @Column(name = "NAME")
    private String name;
    
	/**
	 * {@link CategoryEntity} - categoria
	 * */
    @ManyToOne
    @JoinColumn(name = "CATEGORY")
    private CategoryEntity category;

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

	/**
	 * @return the category
	 */
	public CategoryEntity getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(final CategoryEntity category) {
		this.category = category;
	}

}
