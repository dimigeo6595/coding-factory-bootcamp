package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * ορίζει δύο μεθόδους, τις isEven και
 * isOdd για τον έλεγχο ενός ακεραίου
 * αν είναι άρτιος ή περιττός
 */
public class EvenOddApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        if(isEven(num)){
            System.out.println(num + "Is even");

        }else{
            System.out.println(num + "Is odd");
        }



    }

    public static boolean isEven(int n){

        return(n % 2 == 0);
    }

    public static boolean isOdd(int n){

        return!isEven(n);
    }


}
