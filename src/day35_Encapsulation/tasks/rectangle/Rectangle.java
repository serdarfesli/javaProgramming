package day35_Encapsulation.tasks.rectangle;

public class Rectangle {
    private double width,length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<=0){
            System.err.println("Invalid width");
            return;
        }
        this.width = width;
    } //setter,conditions added

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<=0){
            System.err.println("Invalid length");
            return;
        }
        this.length = length;
    }  //setter,conditions added

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    } //const. with setters

    public double calcArea(){
        return width*length;
    }

    public double calcPerimeter(){
        return 2*(width+length);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }






}
