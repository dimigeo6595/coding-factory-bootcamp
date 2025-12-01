package gr.aueb.cf.cf9.ch5;

import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 * Υπολογίζει τη δύναμη αλλά με μέθοδο.
 */
public class PowerMethodApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 0;

        System.out.println("Please enter a base: ");
        base = scanner.nextInt();

        System.out.println("Please entrer a power");
        power = scanner.nextInt();

        result = expo(base, power);

        System.out.println(base + "^" + power + "=" + result);
    }



    public static int expo(int base,int power){
        int result = 1;

        for(int i = 1; i <= power; i++){
        result *= base;
        }

        return(result);
    }


}
