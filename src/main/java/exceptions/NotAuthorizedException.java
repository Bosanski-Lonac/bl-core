package exceptions;

import org.springframework.http.HttpStatus;

import enums.ErrorCode;

public class NotAuthorizedException extends CustomException {
	public NotAuthorizedException(String message) {
        super(message, ErrorCode.NOT_AUTHORIZED, HttpStatus.FORBIDDEN);
    }
}
