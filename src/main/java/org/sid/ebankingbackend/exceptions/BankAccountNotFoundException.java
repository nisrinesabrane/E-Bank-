package org.sid.ebankingbackend.exceptions;

/**
 * Exception thrown when a requested bank account is not found in the system.
 */
public class BankAccountNotFoundException extends Exception {

    /**
     * Constructs a new BankAccountNotFoundException with the specified detail message.
     *
     * @param message The detail message, typically describing the missing bank account.
     */
    public BankAccountNotFoundException(String message) {
        super(message);
    }

    /**
     * Constructs a new BankAccountNotFoundException with the specified detail message and cause.
     *
     * @param message The detail message.
     * @param cause   The cause of the exception.
     */
    public BankAccountNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new BankAccountNotFoundException with a default message.
     */
    public BankAccountNotFoundException() {
        super("Bank account not found.");
    }
}
}
