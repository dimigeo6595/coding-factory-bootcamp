package gr.aueb.cf.cf9.ch7;

/**
 * Traverses a String char by char.
 * Όχι με enhanced for αλλά με ττην κλασσική for.
 */
public class StrTraverse {
    public static void main(String[] args) {
        String str = "Coding Factory";

        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }


        //print the reverse string

        for(int i = str.length() - 1; i >= 0; i--){

            System.out.println(str.charAt(i));
        }
    }

}
