package gr.aueb.cf.cf9.ch5;

import gr.aueb.cf.cf9.ch4.NewSwitchApp;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγοντικό
 * του n με μέθοδο. Το!n = 1*2*3*...*n και 0! = 1.
 */
public class FactorialApp {
    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int factorial = 0;

        //input data from th user
        System.out.println("Please enter a number");
        num = scanner.nextInt();

        // invoke-call the method
        factorial = facto(num);


        //Print the result
        System.out.println("The factorial of " + num + " is: " + factorial);


    }


    /**
     * Calculates the factorial of n.
     *
     * @param n the number to calculate factorial for
     * @return the factorial of n
     */
    public static int facto(int n){
        int factorial = 1;

        for (int i = 1; i <= n; i++){
            factorial *= i;

        }

        return factorial;
    }
}
