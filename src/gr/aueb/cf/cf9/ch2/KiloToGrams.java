package gr.aueb.cf.cf9.ch2;
/**
 *
 */

import java.util.Scanner;

public class KiloToGrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputWeightInKilos = 0;
        int weightInGrams = 0;

        System.out.println("Παρακαλώ εισάγετε το βάρος σας σε κιλα");

        inputWeightInKilos = scanner.nextInt();
        weightInGrams = inputWeightInKilos * 1000;

        System.out.printf("Το βάρος σας σε γραμμάρια είναι: %,d", weightInGrams);

    }
}
