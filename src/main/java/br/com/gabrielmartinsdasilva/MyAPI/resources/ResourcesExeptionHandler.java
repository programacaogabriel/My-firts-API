package br.com.gabrielmartinsdasilva.MyAPI.resources;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.gabrielmartinsdasilva.MyAPI.services.exeption.StandardError;

@ControllerAdvice
public class ResourcesExeptionHandler {
	
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, 	HttpServletRequest	request){
		StandardError error = new StandardError(HttpStatus.NOT_FOUND.value(),System.currentTimeMillis(), e.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
}
