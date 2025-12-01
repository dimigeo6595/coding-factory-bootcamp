package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Count the number of iterations.
 * When the user inserts -1, the while-do loop will stop.
 */
public class IterationsCountApp {
    public static void main(String[] args) {
        //δήλωση και αρχικοποίηση
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        //Είσοδος δεδομένων
        System.out.println("Please give a number: ");
        num = scanner.nextInt();

        // Επεξεργασία - whilee-do
        while (num != -1){
            iterations++;
            System.out.println("Please enter a number");
            num = scanner.nextInt();
        }

        //Εκτύπωση αποτελεσμάτων
        System.out.println("The count of iterations is: " + iterations);
    }
}
