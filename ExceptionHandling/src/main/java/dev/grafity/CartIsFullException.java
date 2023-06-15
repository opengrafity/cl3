package dev.grafity;

public class CartIsFullException extends Exception {
    public CartIsFullException() {
    }

    public CartIsFullException(String message) {
        super(message);
    }

    public CartIsFullException(String message, Throwable cause) {
        super(message, cause);
    }

    public CartIsFullException(Throwable cause) {
        super(cause);
    }

    public CartIsFullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
