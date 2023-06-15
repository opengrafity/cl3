package dev.grafity.exceptions;

public class PopupNotOpenedException extends Exception{
    public PopupNotOpenedException() {
    }

    public PopupNotOpenedException(String message) {
        super(message);
    }

    public PopupNotOpenedException(String message, Throwable cause) {
        super(message, cause);
    }

    public PopupNotOpenedException(Throwable cause) {
        super(cause);
    }

    public PopupNotOpenedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
