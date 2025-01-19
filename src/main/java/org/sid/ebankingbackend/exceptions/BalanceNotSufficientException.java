package org.sid.ebankingbackend.exceptions;

/**
 * Exception thrown when a bank account has insufficient balance to complete a transaction.
 */
public class BalanceNotSufficientException extends Exception {

    /**
     * Constructs a new BalanceNotSufficientException with the specified detail message.
     * 
     * @param message The detail message, typically describing the issue.
     */
    public BalanceNotSufficientException(String message) {
        super(message);
    }
}
