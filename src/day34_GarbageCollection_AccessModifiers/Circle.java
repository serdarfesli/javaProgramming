package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi;
    public static String name;
    public static ArrayList<Integer> numbers;
   /* public Circle(double radius){
        this.radius=radius;
        pi=3.14;*/

    /*public static void main(String[] args) {
        pi=3.14;
        name="Circle";
    }*/
    static {
        pi=3.14;
        name="Circle";

    }
}

