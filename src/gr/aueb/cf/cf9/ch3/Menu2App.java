package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * εμφανίζει ένα μενού επιλογών μέχρι ο χρήστης να επιλέξει
 * exit (τον αριθμό 3).
 */
public class Menu2App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("Παρακαλώ επιλέξτε ένα από τα παρακάτω: ");
            System.out.println("1. Εισαγωγη αιτησης");
            System.out.println("2. Διαγραφή αίτησης");
            System.out.println("3. Έξοδος");
            choice = scanner.nextInt();
            if (choice == 3){
                break;
            }
        }
    }
}
