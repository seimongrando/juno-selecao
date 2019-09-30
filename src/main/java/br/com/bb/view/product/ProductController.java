package br.com.bb.view.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bb.domain.model.product.Product;
import br.com.bb.domain.service.product.ProductFacade;

/**
 * API Endpoint para Produtos.
 * 
 * @author sgrando
 * @since 24/06/2019
 */
@RestController
@RequestMapping(path = "/product")
public class ProductController {

	/**
	 * {@link ProductFacade}
	 * */
	@Autowired
	private ProductFacade productFacade;
	
    /**
     * Metodo responsavel por listar todos os produtos por categoria.
     * */
	@GetMapping(path = "listByCategory/{category}")
    public ResponseEntity<List<Product>> listByCategory(
    		@PathVariable 
    		final Integer category) {
        return ResponseEntity.ok(
        		productFacade.listProductsByCategory(category));
    }

}
