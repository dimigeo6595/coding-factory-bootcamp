package gr.aueb.cf.cf9.ch6;

/**
 * Ελέγχει αν ένας πίνακασ ακεραίων είναι συμμετρικός ή όχι.
 * Συμμετρικός είναι ένας πίνακας αν διαβάζεται το ίδιο από την αρχή και το τέλος.
 * ΠΧ {1, 2, 3, 3, 2, 1}
 * {1, 2, 3, 2, 1}
 */
public class ArraySymmetric {
    public static void main(String[] args) {
        int[] arr;
    }

    public static boolean isArraySymmetric(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j++) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }

        return true;

    }
}


//    public static boolean isSymmetrical(int[] arr) {
//        boolean isTrue = true;
//
//        for(int i = 0; i <= arr.length / 2; i++) {
//            if(arr[i != arr[arr.length - i - 1]) {
//                isTrue = false;
//                break;
//            }
//
//            return isTrue;
//        }
//
//    }
//
//}
