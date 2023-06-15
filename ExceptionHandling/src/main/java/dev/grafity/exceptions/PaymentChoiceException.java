package dev.grafity.exceptions;

public class PaymentChoiceException extends Exception {
    public PaymentChoiceException() {
    }

    public PaymentChoiceException(String message) {
        super(message);
    }

    public PaymentChoiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public PaymentChoiceException(Throwable cause) {
        super(cause);
    }

    public PaymentChoiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
