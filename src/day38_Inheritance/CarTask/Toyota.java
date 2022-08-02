package day38_Inheritance.CarTask;

public class Toyota extends Car{
    public Toyota( String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles); //constructor
    }

    public void reliable(){
        System.out.println(brand + " "+ model + " is reliable");
    }

    @Override
    public void start() {
        System.out.println("twist the key to ignition");
    }
}
