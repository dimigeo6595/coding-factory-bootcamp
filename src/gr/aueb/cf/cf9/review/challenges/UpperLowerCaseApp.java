package gr.aueb.cf.cf9.review.challenges;

import java.util.Scanner;

/**
 * Δοθέντως ενός String μετατρέπει σε κεφαλαία πεζά εναλλάξ.
 * Π.Χ.: coding -> CoDiNg
 */
public class UpperLowerCaseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        String inputStr = "";
        char ch =' ';

        System.out.println("Please enter a String.");
        inputStr = scanner.nextLine();

        for (int i = 0; i < inputStr.length(); i++){
            ch = inputStr.charAt(i);
            if (Character.isLetter(ch)){
                ch = i % 2 == 0 ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
                stringBuilder.append(ch);
            }
        }

        System.out.println(stringBuilder);
    }
}
