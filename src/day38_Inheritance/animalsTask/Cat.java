package day38_Inheritance.animalsTask;

public class Cat extends Animal {
    public Cat ( String breed, int age, char gender, String size, String color) {
        super("Cat", breed, age, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println("eats cat food");
    }
}
