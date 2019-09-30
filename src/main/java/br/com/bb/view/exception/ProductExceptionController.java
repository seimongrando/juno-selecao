package br.com.bb.view.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.bb.domain.model.exception.ProductNotfoundForCategoryException;

/**
 * Classe responsavel por interceptar excecoes do produto.
 * @author sgrando
 * @since 25/06/2019
 * */
@ControllerAdvice
public class ProductExceptionController {

	@ExceptionHandler(value = ProductNotfoundForCategoryException.class)
	public ResponseEntity<Object> exception(final ProductNotfoundForCategoryException exception) {
		return new ResponseEntity<>("Product not found for Category", HttpStatus.NOT_FOUND);
	}
}
