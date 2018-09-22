package br.com.globalti.serviceconsultapessoa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class InternalServerError extends RuntimeException {
    public InternalServerError() {
        super();
    }

    public InternalServerError(final String message) {
        super(message);
    }

    public InternalServerError(final String message, final Throwable cause) {
        super(message, cause);
    }

    public InternalServerError(final Throwable cause) {
        super(cause);
    }
}