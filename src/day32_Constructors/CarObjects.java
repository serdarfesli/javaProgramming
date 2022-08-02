package day32_Constructors;

public class CarObjects {
    public static void main(String[] args) {
        Car car1= new Car("Toyota");
        Car car2 = new Car("Honda","Accord");
        Car car3 = new Car("Lexus","RKDSK",2021);
        Car car4 = new Car("BMW","Model3",2020,35000,"blue");

        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        System.out.println("car3 = " + car3);
        System.out.println("car4 = " + car4);

    }
}
