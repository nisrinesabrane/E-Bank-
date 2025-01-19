package org.sid.ebankingbackend.enums;

/**
 * Enum representing the different statuses of a bank account.
 * 
 * - CREATED: When the account is created but not yet active.
 * - ACTIVATED: When the account is active and operational.
 * - SUSPENDED: When the account is temporarily disabled.
 */
public enum AccountStatus {
    CREATED, // Initial state of the account
    ACTIVATED, // Account is operational
    SUSPENDED // Account is disabled
}
