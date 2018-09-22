package br.com.globalti.serviceconsultapessoa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequest extends RuntimeException {
    public BadRequest() {
        super();
    }

    public BadRequest(final String message) {
        super(message);
    }

    public BadRequest(final String message, final Throwable cause) {
        super(message, cause);
    }

    public BadRequest(final Throwable cause) {
        super(cause);
    }
}