package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * o xρήστης εισ'αγει αριθμητη και παρονομαστή και το
 * πρόγραμμα υπολογίζει το πηλίκο επαναληπτικά.
 *
 * Αν ο αριθμητής είναι 0, τότε το πρόγραμμα διακόπτεται.
 * Αν ο παρονομαστής είναι 0, τότε η διαδικασία επαναλαμβάνεται.
 *
 */
public class DivisionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;



        while (true){
            System.out.println("Please insert a numerator :");
            numerator = scanner.nextInt();

            if (numerator == 0){
                System.out.println("Numerator is 0. Quitting...");
                break;
            }

            System.out.println("Please insert a denominator :");
            denominator = scanner.nextInt();

            if (denominator == 0){
                System.out.println("Denominator is 0. Please enter a valid denominator.");
                continue;
            }

            result = numerator / denominator;
            System.out.println("Result: " + result);
        }
    }
}
