package day38_Inheritance.CarTask;

public class Tesla extends Car {

    public Tesla(String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }

    @Override
    public void start() {
        System.out.println("say Start to start the engine");
    }

    public void autoPilot() {
        System.out.println(brand + " "+ model + " is driven by autoPilot");
    }

}
