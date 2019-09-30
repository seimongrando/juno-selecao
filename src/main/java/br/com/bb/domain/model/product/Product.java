package br.com.bb.domain.model.product;

import java.io.Serializable;

import br.com.bb.domain.model.category.Category;
import br.com.bb.domain.model.exception.InvalidAttributeException;

/**
 * Classe responsavel por modelar o produto.
 * 	Serializavel pois como o modelo eh centralizado o objeto pode acabar trafegando entre as camadas.
 * @author sgrando
 * @since 24/06/2019
 * */
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 918880064916516791L;

	/**
	 * Construtor Privado
	 * 	Construcao sera efetuada pelo Builder.
	 * */
	private Product(){}
	
	/**
	 * Builder responsavel pela criacao da categoria
	 * */
	public static class Builder {
		
		/**
		 * Atributos 'sombreados' do produto
		 * */
		private Integer identifier;
		private String name;
		private Category category;
		
		/**
		 * Todo produto DEVE ter uma categoria associada na criacao
		 * */
		public Builder(final Category category){
			this.category = category;
		}
		
		public Builder withIdentifier(final Integer id) {
			this.identifier = id;
			return this;
		}
		
		public Builder withName(final String name) {
			this.name = name;
			return this;
		}
		
		/**
		 * Constroe o Produto
		 * */
		public Product build() {
			Product product = new Product();
			product.identifier = this.identifier;
			product.name = this.name;
			product.category = this.category;
			
			if (product.identifier == null || product.identifier == 0) {
				throw new InvalidAttributeException("Invalid Identifier.");
			}
			if (product.name == null || product.name.isEmpty()) {
				throw new InvalidAttributeException("Invalid Name.");
			}
			if (product.category == null) {
				throw new InvalidAttributeException("Invalid Category.");
			}
			
			return product;
		}
		
	}
	
	/**
	 * Atributos imutaveis
	 * */
	private Integer identifier;
	private String name;
	private Category category;
	/**
	 * Atributos imutaveis
	 * */

	/**
	 * @return the identifier
	 */
	public Integer getIdentifier() {
		return identifier;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}
}
