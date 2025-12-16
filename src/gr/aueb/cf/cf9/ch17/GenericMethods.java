package gr.aueb.cf.cf9.ch17;

public class GenericMethods {

    public static void main(String[] args) {

        String[] strings = { "Athens", "Berlin", "Paris" };
        Integer[] integers = { 1, 2, 3 };

        printArray(strings);
        printArray(integers);

    }

    public static <T> void  printArray(T[] array){
        for(T element : array){
            System.out.println(element);
        }
    }

    public static void print(GenericNode<?> node){
        System.out.println(node.getValue());
    }

    public static void printNumber(GenericNode<? extends Number> node){
        System.out.println(node.getValue());
    }

    public static void printNumber2(GenericNode<? super Integer>  node){
        System.out.println(node.getValue());
    }


}
