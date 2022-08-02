package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        Tiger tiger1 = new Tiger();
        dog1.setInfo("Max","Husky",'M',"Small",2,"white");
        // dog1.scratch();
        dog1.bark();
        dog1.sleep();
        dog1.eat();
        cat1.setInfo("TArcın","British",'F',"medium",4,"white");
        cat1.sleep();
        cat1.meow();

    }
}