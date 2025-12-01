package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το απόλυτο ενός ακεραίου με τη χρήση
 * τριαδικού τελεστή.
 *
 */
public class AbsTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("Παρακαλώ εισάγεται έναν ακέραιο: ");
        num = scanner.nextInt();

        abs = (num >= 0) ? num : (-num);
        System.out.println("Το απόλυτο του ακεραίου είναι: ");

    }
}
