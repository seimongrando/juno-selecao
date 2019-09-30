package br.com.bb.view.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bb.domain.model.category.Category;
import br.com.bb.domain.service.category.CategoryFacade;

/**
 * API Endpoint para Categorias.
 * 
 * @author sgrando
 * @since 24/06/2019
 */
@RestController
@RequestMapping(path = "/category")
public class CategoryController {

	/**
	 * {@link CategoryFacade}
	 * */
    @Autowired
    private CategoryFacade categoryFacade;

    /**
     * Metodo responsavel por listar todas as categorias.
     * */
    @GetMapping(path = "listAll")
    public ResponseEntity<List<Category>> retrieveAllCategories() {
        return ResponseEntity.ok(categoryFacade.listAll());
    }

}
