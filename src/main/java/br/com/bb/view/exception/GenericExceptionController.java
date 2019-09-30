package br.com.bb.view.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.bb.domain.model.exception.InvalidAttributeException;

/**
 * Classe responsavel por interceptar excecoes genericas.
 * @author sgrando
 * @since 25/06/2019
 * */
@ControllerAdvice
public class GenericExceptionController {

	@ExceptionHandler(value = InvalidAttributeException.class)
	public ResponseEntity<Object> exception(final InvalidAttributeException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
	}

}
