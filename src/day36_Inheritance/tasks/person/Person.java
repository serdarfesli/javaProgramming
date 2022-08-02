package day36_Inheritance.tasks.person;

public class Person {
    public String name;
    public int age;
    public char gender;

    public void setInfo(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    } //setInfo method

    public void eat(String food){
        System.out.println(name + " is eating "+ food);
    }
    public void drink(String drink){
        System.out.println(name + " is drinking "+ drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    } //toString
}
