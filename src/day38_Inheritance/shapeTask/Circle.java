package day38_Inheritance.shapeTask;

public class Circle extends Shape {
    public double radius;
    public static double pi = 3.14;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area() {
        return pi * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                "pi='" + pi + '\'' +
                "radius='" + radius + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }

}


