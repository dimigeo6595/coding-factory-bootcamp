package gr.aueb.cf.cf9.ch6;

/**
 * Deep copy. Fresh copy
 */
public class DeepArrayCopy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrayCopy;
        arrayCopy = getArrayDeepCopy(arr);

        arrayCopy[0] = 1000;
        System.out.println(arr[0]);

    }

    public static int[] getArrayDeepCopy(int[] arr){
        int[] destinationArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            destinationArr[i] = arr[i];
        }
        return destinationArr;
    }
}
