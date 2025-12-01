package gr.aueb.cf.cf9.review.mid_level;

public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int max = maxValue(arr);
        System.out.println(max);

    }

    public static int maxValue(int[] arr) {
        if (arr.length == 0 || arr == null ) return  Integer.MIN_VALUE;

        int max = Integer.MIN_VALUE;

        for (int item : arr){
            if (item > max) max = item;
        }

        return max;
    }
}
