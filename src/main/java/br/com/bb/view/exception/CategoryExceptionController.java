package br.com.bb.view.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.bb.domain.model.exception.CategoryNotRegisteredException;
import br.com.bb.domain.model.exception.CategoryNotfoundException;

/**
 * Classe responsavel por interceptar excecoes da categoria.
 * @author sgrando
 * @since 25/06/2019
 * */
@ControllerAdvice
public class CategoryExceptionController {

	@ExceptionHandler(value = CategoryNotRegisteredException.class)
	public ResponseEntity<Object> exception(final CategoryNotRegisteredException exception) {
		return new ResponseEntity<>("No categories registered", HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = CategoryNotfoundException.class)
	public ResponseEntity<Object> exception(final CategoryNotfoundException exception) {
		return new ResponseEntity<>("Category not found", HttpStatus.NOT_FOUND);
	}
}
