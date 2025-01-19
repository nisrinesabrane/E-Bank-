package org.sid.ebankingbackend.exceptions;

/**
 * Exception thrown when a requested customer is not found in the system.
 */
public class CustomerNotFoundException extends Exception {

    /**
     * Constructs a new CustomerNotFoundException with the specified detail message.
     *
     * @param message The detail message, typically describing the missing customer.
     */
    public CustomerNotFoundException(String message) {
        super(message);
    }

    /**
     * Constructs a new CustomerNotFoundException with the specified detail message and cause.
     *
     * @param message The detail message.
     * @param cause   The cause of the exception.
     */
    public CustomerNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new CustomerNotFoundException with a default message.
     */
    public CustomerNotFoundException() {
        super("Customer not found.");
    }
}
