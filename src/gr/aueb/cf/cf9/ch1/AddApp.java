package gr.aueb.cf.cf9.ch1;

/**
 * Προσθέτει 2 ακεραίους και εμφανίζει το αποτέλεσμα στην κονσόλα.
 */
public class AddApp {
    public static void main(String[] args) {
        // declare and initialize
        int num1 = 500_000 ;
        int num2 = 10_000;
        int result = 0;

        //commands
        result = num1 + num2;

        //print the result
        System.out.println("Το αποτέλεσμα ειναι: " + result);
        System.out.println("Το αποτέλεσμα των: " + num1 + " και " + num2 + " είναι: "+ result);
        System.out.printf("Το άθροισμα των %,d, %,d είναι: %,d\n",num1, num2, result);
    }
}
