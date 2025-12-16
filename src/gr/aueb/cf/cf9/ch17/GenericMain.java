package gr.aueb.cf.cf9.ch17;

public class GenericMain {
    public static void main(String[] args) {
        GenericNode<String> strNode = new GenericNode<>();
        GenericNode<Integer> intNode = new GenericNode<>(); // όχι primitive ως παραμετρικοί τύποι.

        var intNode2 = new GenericNode<Integer>();

//      intNode.setValue("String");
//

    }
}
