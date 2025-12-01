package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης δινει την ηλικία του σε έτη-εστω ακεραιος-
 * και το προγραμμα επιστρέφει την ηλικία σε ημέρες όπου
 * θεωρούμε ότι ένα έτος = 365 ημέρρες.
 */
public class YearsToDays {
    public static void main(String[] args) {
        //δήλωση
        final int DAYS_IN_YEAR = 365;
        int inputAgeInYears;

        int ageInDays = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Παρακαλώ δώσε την ηλικία σου");
        inputAgeInYears = scanner.nextInt();
        ageInDays = inputAgeInYears * DAYS_IN_YEAR;

        System.out.printf("Ηλικία σε έτη: %d, Ηλικία σε ημέρες: %d", inputAgeInYears, ageInDays);


    }
}
