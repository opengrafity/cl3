package dev.grafity.exceptions;

public class ChoiceNotMadeException extends Exception {
    public ChoiceNotMadeException() {
    }

    public ChoiceNotMadeException(String message) {
        super(message);
    }

    public ChoiceNotMadeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ChoiceNotMadeException(Throwable cause) {
        super(cause);
    }

    public ChoiceNotMadeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
