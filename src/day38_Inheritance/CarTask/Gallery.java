package day38_Inheritance.CarTask;

import day36_Inheritance.tasks.person.Tester;

public class Gallery {
    public static void main(String[] args) {

        Toyota toyota1 = new Toyota("Corolla", 2015, 20_000+5_000, "white", 150_000);
        BMW bmw1 = new BMW("3.20", 2018, 15000, "black", 100_000);
        Tesla tesla1 = new Tesla("model 3", 2022, 20_000, "blue", 15_000);

        toyota1.reliable();
tesla1.autoPilot();
bmw1.breaksDown();
        System.out.println(toyota1);

    }
}