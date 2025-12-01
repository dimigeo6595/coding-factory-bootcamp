package gr.aueb.cf.cf9.ch6;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6 };
        int[] sorted;

        System.out.println("Before sorting: ");
        printArray(arr);

        System.out.println("After sorting: ");
        sorted = selectionSort(arr);
        printArray (arr);

    }


    public static int[] selectionSort(int[] arr){
        int minPosition;
        int minValue;
        for (int i = 0; i < arr.length; i++){
            minPosition = i;
            minValue = arr[minPosition];

            for (int j = i + 1; j < arr.length; j++){

                if (arr[j] < minValue) {

                    minPosition = j;
                    minValue = arr[minPosition];
                }
            }
            swap(arr, minPosition, i);

        }
        return arr;
    }


    public static void swap (int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = arr[i];
    }

    public static void printArray(int[] arr){
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}

