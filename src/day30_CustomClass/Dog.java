package day30_CustomClass;

public class Dog {
    public String name;
    public String size;
    public String color;
    public String breed;
    public int age;
    public char gender;


    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender,
                        String dogSize, String dogColor){
        name=dogName;
        size=dogSize;
        color=dogColor;
        breed=dogBreed;
        age=dogAge;
    }
    public void eat() {
        System.out.println(name + " is eating");
    }
    public void bark(){
        System.out.println(name+" is barking");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
Attributes
name,gender,age,breed, size,color

Actions
eat(), play(), bark()
 */