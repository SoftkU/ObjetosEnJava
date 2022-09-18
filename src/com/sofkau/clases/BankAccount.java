/**
 * Represents a person entity with 5 attributes:
 * 1 - Name
 * 2 - Last Name One
 * 3 - Last Name Two
 * 4 - Date birth
 * 5 - Height
 * @author Duhan Enrique Renteria Hernandez
 */

package com.sofkau.clases;

public class BankAccount {

    // PROPERTIES OR ATTRIBUTES
    private int accountNumber;
    protected boolean activated;

    // CONSTRUCTORS

    // Void constructor
    /**
     * Create an instance with no attributes of the Person class
     */
    public BankAccount() {
        super();
    }

    // Constructor with properties or attributes
    /**
     * Create an instance with attributes of the Person class
     * @param accountNumber Account number of the bank account.
     * @param activated Activation status of the bank account number.
     */
    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    // METHODS

    /**
     * Method getter account number
     * @return Get the account number of the bank account.
     */
    public int getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * Method setter account number
     * @param accountNumber Set the account number of the bank account.
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Method getter activated
     * @return Get activation status of the bank account number.
     */
    public boolean getActivated() {
        return activated;
    }

    /**
     * Method setter activated
     * @param activated Set activation status of the bank account number.
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
     *
     * @return It shows on the screen the attributes that an instance of BankAccount contains.
     */
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", activated=" + activated +
                '}';
    }
}
