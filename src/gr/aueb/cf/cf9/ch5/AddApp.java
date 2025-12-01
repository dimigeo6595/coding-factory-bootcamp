package gr.aueb.cf.cf9.ch5;

/**
 * Demo of addition method.
 */
public class AddApp {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int sum = 0;

        sum = add(num1, num2);

        System.out.println("The sum is: " + sum);


    }



    public static int add(int a, int b){

//        //Δήλωση και αρχικοποίηση
//        int sum = 0;
//
//        // Επεξεργασία των δεδομένων εισόδου
//        sum = a + b;
//
//        //Επιστοφή αποτελεσμάτος
//        return sum;

        return a + b;
    }
}
