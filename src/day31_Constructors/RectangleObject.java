package day31_Constructors;

public class RectangleObject {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(20, 15);
        Rectangle rectangle2 = new Rectangle(78, 65);
        Rectangle rectangle3 = new Rectangle(5, 3);
        Rectangle rectangle4 = new Rectangle(6, 6);

        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();
        System.out.println("rectangle1 = " + rectangle1);
    }
}