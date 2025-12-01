package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγε έναν ακέραιο που συμβολίζει μια θερμοκρασία.
 * και το πρόγραμμα υπολίζει αν η θερμοκρασία αυτή
 * είναι αρνητική (θ < 0) τότε μία μεταβλητή γίνεται true
 * διαφορετικά γίνεται false
 */
public class TemperatureApp {
    public static void main(String[] args) {
        //Declaration
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isTempBelowZero = false;

        //Data Input
        System.out.println("Παρακαλώ εισάγετε μία θερμοκρασία");
        temperature = scanner.nextInt();

        //Data processing
        isTempBelowZero = temperature < 0;

        //Feedback to the user
        System.out.println("Η θερμοκρασία είναι μικρότερερη από 0:" + isTempBelowZero);
    }
}
