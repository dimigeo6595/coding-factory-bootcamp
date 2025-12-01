package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;
import java.util.function.DoubleFunction;

/**
 * Διαβάζει 2 ακεραίους από το stdin
 * και υπολογίζει το αποτέλεσμα.
 */
public class AddScannerApp {
    public static void main(String[] args) {
        //δδήλωση
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        // Εντολές
        System.out.println("Παρακαλώ εισάγετε δύο ακεραίους");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        sum = num1 + num2;
        //Εκτύπωη
        System.out.printf("To άθροισμα των %d και %d είναι ίσο με: ", num1, num2, sum);



    }
}
