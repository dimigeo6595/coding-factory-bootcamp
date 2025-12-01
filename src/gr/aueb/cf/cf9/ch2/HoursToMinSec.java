package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * calculates the ninutes and seconds of
 * a given number
 */
public class HoursToMinSec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutes = 0;
        int seconds = 0;
        int inputHours = 0;
        final int minutesIndex = 60;
        final int secondsIndex = 3600;

        System.out.println("Παρακαλώ εισάγετε τον χρόνο σε ώρες");
        inputHours = scanner.nextInt();
        minutes = inputHours * minutesIndex;
        seconds = inputHours * secondsIndex;

        System.out.printf("Ο Χρόνος σε λεπτά είναι: %d, o Χρόνος σε δευτ/τα είναι: %d", minutes, seconds);



    }

}
