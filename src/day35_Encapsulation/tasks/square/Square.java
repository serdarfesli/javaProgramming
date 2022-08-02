package day35_Encapsulation.tasks.square;

public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<0){
            System.err.println("Invalid Side");
            return;
        }
        this.side = side;
    }  //setter

    public Square(double side) {
        setSide(side);
    } //constructor with setter

    public double calcArea(){
        return side*side;
    }

    public double calcPerimeter(){
        return 4*side;
    }

    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    } //tostring method
}
