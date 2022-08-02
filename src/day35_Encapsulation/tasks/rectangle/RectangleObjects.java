package day35_Encapsulation.tasks.rectangle;

import day35_Encapsulation.tasks.rectangle.Rectangle;

public class RectangleObjects {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(0, 0);
        System.out.println(rectangle1);
        rectangle1.setLength(2);
        rectangle1.setWidth(3);
        System.out.println( rectangle1.calcPerimeter() );
        System.out.println( rectangle1.calcArea() );
        System.out.println(rectangle1);

    }
}
