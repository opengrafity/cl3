package dev.grafity.exceptions;

public class AmountTranferException extends Exception {
    public AmountTranferException() {
    }

    public AmountTranferException(String message) {
        super(message);
    }

    public AmountTranferException(String message, Throwable cause) {
        super(message, cause);
    }

    public AmountTranferException(Throwable cause) {
        super(cause);
    }

    public AmountTranferException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
