package dev.grafity.exceptions;

public class CheckoutFailedException extends Exception {
    public CheckoutFailedException() {
    }

    public CheckoutFailedException(String message) {
        super(message);
    }

    public CheckoutFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public CheckoutFailedException(Throwable cause) {
        super(cause);
    }

    public CheckoutFailedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
