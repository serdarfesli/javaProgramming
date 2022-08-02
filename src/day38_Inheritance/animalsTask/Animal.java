package day38_Inheritance.animalsTask;

public class Animal {
    public String name, breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    public Animal(String name, String breed, int age, char gender, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.size = size;
        this.color = color;
    }

    public void eat() {

    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
