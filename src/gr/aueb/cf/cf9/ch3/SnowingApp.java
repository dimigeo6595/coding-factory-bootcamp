package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * The user insert eh temperature in celius, and the
 * status of isRaining variable and calculates if it is
 * snowing or not. If it is raining and the temp < 0 then,
 * it is snowing.
 */
public class SnowingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        boolean isSnowing = false;
        boolean isRaining = true;

        System.out.println("Παρακαλώ εισάγετε αν βρέχει (true/false");
        isRaining = scanner.nextBoolean();
        System.out.println("Παρακαλώ εισάγετε τη θερμοκρασία");
        temp = scanner.nextInt();

        isSnowing = (isRaining) && (temp < 0);  //Short - Circuit Operator

        System.out.println("Έξω χιονίζει: " + isSnowing);

    }
}
