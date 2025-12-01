package gr.aueb.cf.cf9.ch7;

/**
 * Παλινδρομική είναι μία πρόταση (Strings)
 * όταν διαβάζεται το ίδιο από την αρχή και
 * από το τέλος.
 */
public class Palindrome2 {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j++) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

        }
        return true;
    }


    public static boolean isPalindrome2(String str) {
        return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);

    }
}