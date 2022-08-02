package day38_Inheritance.shapeTask;

public class ShapeObjects {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Rectangle rectangle1 = new Rectangle(3,5);
        Square square1 = new Square(4);
        System.out.println( circle1.area());
        System.out.println(circle1);
        System.out.println(square1);
        System.out.println(rectangle1);


    }
}
