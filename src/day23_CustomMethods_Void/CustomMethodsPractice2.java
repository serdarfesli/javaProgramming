package day23_CustomMethods_Void;

public class CustomMethodsPractice2 {
    public static void main(String[] args) {
        evenNumbers1To100();
    }
    public static void printHelloWorld5Times(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello World");
        }
    }
    public static void printHelloCyde5Times(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello Cydeo");
        }
    }
public static void evenNumbers1To100(){
        int i=2;
    for ( i = 2; i <100 ; i+=2) {
        System.out.print(i+" ");
    }
}
}
