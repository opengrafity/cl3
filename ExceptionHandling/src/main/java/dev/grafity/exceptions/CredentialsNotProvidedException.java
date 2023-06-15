package dev.grafity.exceptions;

public class CredentialsNotProvidedException extends Exception {
    public CredentialsNotProvidedException() {
    }

    public CredentialsNotProvidedException(String message) {
        super(message);
    }

    public CredentialsNotProvidedException(String message, Throwable cause) {
        super(message, cause);
    }

    public CredentialsNotProvidedException(Throwable cause) {
        super(cause);
    }

    public CredentialsNotProvidedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
