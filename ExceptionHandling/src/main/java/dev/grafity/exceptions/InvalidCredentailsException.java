package dev.grafity.exceptions;

public class InvalidCredentailsException extends Exception {
    public InvalidCredentailsException() {
    }

    public InvalidCredentailsException(String message) {
        super(message);
    }

    public InvalidCredentailsException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidCredentailsException(Throwable cause) {
        super(cause);
    }

    public InvalidCredentailsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
