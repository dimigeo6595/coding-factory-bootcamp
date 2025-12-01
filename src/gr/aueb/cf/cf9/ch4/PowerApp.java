package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * the user inserts the base and the power and the app
 * calculates (bases)^(power)
 */
public class PowerApp {
    public static void main(String[] args) {
        int base = 0;
        int power = 0;
        int result = 1;
        Scanner scanner = new Scanner(System.in);


       System.out.println("Please insert the base: ");
       base = scanner.nextInt();
       System.out.println("Plsease insert the power: ");
       power = scanner.nextInt();

       for (int i = 1; i <= power; i++){
           result *= base;
       }

       System.out.println(base + "^" + power + "=" + result);

    }
}

