package edu.pe.trentino.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CustomException extends RuntimeException {

    public CustomException() {
        super();
    }

    public CustomException(String message, Throwable caused) {
        super(message, caused);
    }

    public CustomException(String message) {
        super(message);
    }

    public CustomException(Throwable caused) {
        super(caused);
    }
}
