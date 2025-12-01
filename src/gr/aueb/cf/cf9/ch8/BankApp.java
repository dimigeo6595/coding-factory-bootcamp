package gr.aueb.cf.cf9.ch8;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Η {@link BankApp} παρέχει μόνο μία υπηρεσία,
 * αυτή της κατάθεσης
 */
public class BankApp {
    static double balance = 0.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = 0.0;

       try {
            System.out.println("PLease enter an amount to deposit: ");
            amount = scanner.nextDouble();
            deposit(amount);
            System.out.println("Το νέο σας υπόλοιπο μετά την κατάθεση είναι: " + balance);
        }catch (Exception e){
            System.out.println("Δεν μπορεί να γίνει κατάθεση αρνητικού ποσού");

        }

    }


    /**
     *Deposit an ammount of money.
     * @param ammount the ammount to deposit
     * @throws Exception if the ammount is negative
     */
    public static void deposit(double ammount) throws Exception{

        try {
            if(ammount < 0) throw new Exception("Ammount cannot be negative.");
            balance += ammount;
            // logging
        }catch (Exception e){
            System.err.println(LocalDateTime.now() + "\n" + e.getMessage()); //logging
            throw e;    //rethrow the exception
        }


    }
}
