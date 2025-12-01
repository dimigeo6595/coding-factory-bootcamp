package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * υπολογίζι το πλήθος των ψηφίων ενός ακεραίου.
 * ΠΧ ο ακέραιος 453 έχει πλήθος 3 ψηφία.
 */
public class DigitsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int div = -1;
        int digits = 0;
        int inputNum = 0;

        System.out.println("Παρακαλώ εισάγεται έναν αριθμό: ");
        num = scanner.nextInt();

        inputNum = num;
        do {
            digits++;
            num /= 10;
        }while (num > 0);

        System.out.println("Τhe number of digits of " + inputNum + "is: " + digits);


    }
}
