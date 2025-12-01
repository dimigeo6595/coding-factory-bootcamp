package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

/**
 * Το {@link java.util.InputMismatchException}
 * συμβαίνει όταν ο {@link java.util.Scanner}
 * αποτυγχάνει να διαβάσει τον σωστό τύπο δεδομένων.
 */
public class InputExceptionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;

        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο: ");
//      num1 = scanner.nextInt();
//
        while (!scanner.hasNext()){
            System.out.println("Μη αποδεκτοί χαρακτήρες");
            scanner.next();
        }

        num1 = scanner.nextInt();

        System.out.println("Num: " + num1);
    }
}
