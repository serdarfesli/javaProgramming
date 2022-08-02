package day38_Inheritance.animalsTask;

public class Tiger extends Animal{
    public Tiger( String breed, int age, char gender, String size, String color) {
        super("Tiger", breed, age, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println("eats deer");
    }
}
