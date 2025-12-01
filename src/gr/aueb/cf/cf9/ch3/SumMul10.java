package gr.aueb.cf.cf9.ch3;

/**
 * Sum of 10 numbers, from 1 to 10.
 * Product of 10 nums.
 */
public class SumMul10 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int prod = 1;
        int j =1;

        while(i <= 10){
            sum += i; //sum = sum + i;
            i++;
        }

        while (j <= 10){
            prod *= j; // prod = prod * j
            j++;
        }

        System.out.println("Product= " + prod);
        System.out.println("Sum= " + sum);
    }
}
