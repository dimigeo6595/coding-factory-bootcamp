package gr.aueb.cf.cf9.ch18.bankapp.dto;

public record AccountInsertDTO(String iban, double balance) {

}

//import java.util.Objects;

//public class AccountInsertDTO {
//    private String iban;
//    private double balance;
//
//    public AccountInsertDTO(){
//
//    }
//
//    public AccountInsertDTO(double balance, String iban) {
//        this.balance = balance;
//        this.iban = iban;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//
//    public String getIban() {
//        return iban;
//    }
//
//    public void setIban(String iban) {
//        this.iban = iban;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (!(o instanceof AccountInsertDTO that)) return false;
//        return Double.compare(balance, that.balance) == 0 && Objects.equals(iban, that.iban);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(iban, balance);
//    }
//
//    @Override
//    public String toString() {
//        return "AccountInsertDTO{" +
//                "balance=" + balance +
//                ", iban='" + iban + '\'' +
//                '}';
//    }

