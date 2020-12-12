package exceptions;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler {
	@ExceptionHandler(CustomException.class)
	public ResponseEntity<Object> handleCustomException(
			CustomException ex, WebRequest request) {
		
		Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", ex.getMessage());
        
		return new ResponseEntity<>(body, ex.getHttpStatus());
	}
	
	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<Object> handleCustomException(
			DataIntegrityViolationException ex, WebRequest request) {
		
		Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "Vaši podaci nisu validni, možda su e-mail ili broj pasoša već registrovani na servisu?");
        
		return new ResponseEntity<>(body, HttpStatus.CONFLICT);
	}
}
