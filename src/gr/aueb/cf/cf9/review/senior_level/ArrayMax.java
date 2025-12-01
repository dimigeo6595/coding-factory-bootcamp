package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 * Calculates the max value of an array.
 */
public class ArrayMax {
    public static void main(String[] args) {
        final int SIZE = 5;
        int[] numbers = new int[SIZE];
        Scanner scanner = new Scanner(System.in);
        int maxPosition = 0;
        int maxValue = 0;

        //Data input, validation, data binding.
        System.out.println("Please enter five numbers: ");
        for (int i = 0; i < numbers.length; i++){

            //Validate input
            while (!scanner.hasNextInt()){
                System.out.println("Invalid input. Please give a number.");
                scanner.nextLine();
            }

            numbers[i] = scanner.nextInt();
        }

        //Delegation
        maxPosition = getMaxPosition(numbers);
        maxValue = numbers[maxPosition];

        //Prints the result
        System.out.printf("The maximum value is %d at position %d.", maxValue, (maxPosition +1));
    }

    /**
     * Finds the position of the maximum value in an array.
     * @param arr the input array.
     * @return the max position.
     */
    public static int getMaxPosition(int[] arr){
        if (arr == null || arr.length == 0) return Integer.MIN_VALUE;
        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = 1; i < arr.length; i++){
            if(arr[i] > maxValue){
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}
