package br.com.bb.domain.model.category;

import java.io.Serializable;

import br.com.bb.domain.model.exception.InvalidAttributeException;

/**
 * Classe responsavel por modelar a categoria.
 * 	Serializavel pois como o modelo eh centralizado o objeto pode acabar trafegando entre as camadas.
 * @author sgrando
 * @since 24/06/2019
 * */
public class Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2667356774702206389L;

	/**
	 * Construtor Privado
	 * 	Construcao sera efetuada pelo Builder.
	 * */
	private Category(){}
	
	/**
	 * Builder responsavel pela criacao da categoria
	 * */
	public static class Builder {
		
		/**
		 * Atributos 'sombreados' da categoria
		 * */
		private Integer identifier;
		private String name;
		
		public Builder(){}
		
		public Builder withIdentifier(final Integer id) {
			this.identifier = id;
			return this;
		}
		
		public Builder withName(final String name) {
			this.name = name;
			return this;
		}
		
		/**
		 * Constroe a categoria
		 * */
		public Category build() {
			Category category = new Category();
			category.identifier = this.identifier;
			category.name = this.name;
			
			if (this.identifier == null || this.identifier == 0) {
				throw new InvalidAttributeException("Invalid Identifier.");
			}
			if (this.name == null || this.name.isEmpty()) {
				throw new InvalidAttributeException("Invalid Name.");
			}
			
			return category;
		}
		
	}
	
	/**
	 * Atributos imutaveis
	 * */
	private Integer identifier;
	private String name;
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

}
