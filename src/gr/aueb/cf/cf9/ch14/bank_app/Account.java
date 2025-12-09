package gr.aueb.cf.cf9.ch14.bank_app;

import java.time.LocalDateTime;

public class Account {
    private long id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public Account(){

    }

    public Account(long id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Public API

    /**
     * Deposit the specified amount of money into the account.
     * @param amount the amount to deposit
     * @throws {@link NegativeAmountException} if the amount is negative
     */
    public void deposit (double amount) throws NegativeAmountException {
        try {
            if (amount < 0) throw new NegativeAmountException("The amount" + amount + "should be positive");
            balance += amount;
            // log
        } catch (NegativeAmountException e) {
            System.err.println("Negative amount= " + amount + "is not allowed." + "\n" + e.getMessage());
            throw e;
        }
    }

    /**
     * Withdraws the specified amount of money.
     * @param amount The amount to be withdrawn.
     * @param ssn The SSN of the account holder.
     * @throws {@link InsufficientBalanceException}, {@link NegativeAmountException}, {@link SsnNotValidException} Exception If the amount is negative, the balance insufficient or the SSN does not match.
     */
    public void withdraw(double amount, String ssn) throws InsufficientBalanceException, NegativeAmountException, SsnNotValidException{
        try {
            if (amount < 0) throw new NegativeAmountException("The amount: " + amount + "should be positive");
            if (amount > balance) throw new InsufficientBalanceException("Insufficient balance.");
            if (!isSsnValid(ssn)) throw new SsnNotValidException("The SSN does not match.");
            balance -= amount;
        }catch (NegativeAmountException | InsufficientBalanceException | SsnNotValidException e){
            System.err.println(LocalDateTime.now() + "\n" + e.getMessage());
        }
    }

    /**
     * Returns the current balance of this account.
     * @return the current balance of this account
     */
    public double getAccountBalance(){
        return getBalance();
    }

    public String accountToString(){
        return "Account ID: " + id + " IBAN: " + " Firstname: " + firstname +
                " Lastname: " + lastname + " SSN: " + ssn + " Balance: ";
    }

    private boolean isSsnValid(String ssn){
        return ssn.equals(this.ssn);
    }
}
