package gr.aueb.cf.cf9.ch5;

public class PowerRecursiveApp {
    public static void main(String[] args) {
        int base = 2;
        int power = 3;
        int result = 0;


        result = pow(base, power);

        System.out.println(result);
    }

    public static int pow(int base, int power){

        return power == 0 ? 1 : base * pow(base,power - 1);

    }
}

