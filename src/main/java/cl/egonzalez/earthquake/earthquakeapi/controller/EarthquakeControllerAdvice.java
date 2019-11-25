package cl.egonzalez.earthquake.earthquakeapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@ControllerAdvice(assignableTypes = EarthquakeController.class)
public class EarthquakeControllerAdvice {

	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public final ResponseEntity<Object> handleMethodArgumentTypeMismatchException(
			MethodArgumentTypeMismatchException ex, WebRequest request) {

		return new ResponseEntity<>("Error en los parámetros de entrada " + ex.getName(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleUserNotFoundException(Exception ex, WebRequest request) {

		return new ResponseEntity<>("Error " + ex, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
