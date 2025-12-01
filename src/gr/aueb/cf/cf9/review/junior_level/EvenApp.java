package gr.aueb.cf.cf9.review.junior_level;

import java.util.Scanner;

public class EvenApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 10;

        if (num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }

}
