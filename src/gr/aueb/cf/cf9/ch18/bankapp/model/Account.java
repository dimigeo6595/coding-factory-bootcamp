package gr.aueb.cf.cf9.ch18.bankapp.model;

import java.util.Objects;

public class Account {
    private String iban;
    private double balance;

    public Account(){

    }

    public Account(double balance, String iban) {
        this.balance = balance;
        this.iban = iban;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Account account)) return false;
        return Objects.equals(this.getIban(), account.getIban());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIban());
    }
}
