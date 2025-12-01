package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * προγραμμα που λαμβάνει απο το χρήστη ένα ποσο σε ευρώ και το
 * μετατρέπει σε δολάρια ΗΠΑ με βάση μια ισοτιμιία
 * έστω ισοτιμία 1 euro = 99 usd cents.
 * αν ο χρήστης δώσει 108 ευρώ τα συνολικά σεντς είναι 9985
 * που αντιστοιχούν σε 99 δολάρια και 8 cents.
 */
public class EurToUsdConverter {
    public static void main(String[] args) {
        //Δήλωση
        final int RATIO = 99;
        int inputEur = 0;
        int usdCents = 0;
        int outputUsd = 0;
        int outputCents = 0;

        //Data input from the user
        Scanner scanner = new Scanner(System.in);

        //Data Processing - Expressions
        System.out.println("Παρακαλώ εισάγετε ένα ποσό σε ευρώ");
        inputEur = scanner.nextInt();
        usdCents = inputEur * RATIO;
        outputUsd = usdCents / 100;
        outputCents = usdCents % 100;

        //Data output
        System.out.printf("To ποσό σε δολάρια είναι: %,d USD και %d cents.", outputUsd, outputCents);

    }
}
