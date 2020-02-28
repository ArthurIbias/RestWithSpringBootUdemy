package br.com.erudio.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * UnsuportedMathOpetarionException
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportedMathOpetarionException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public UnsuportedMathOpetarionException(String exception) {
        super(exception);
    }
}