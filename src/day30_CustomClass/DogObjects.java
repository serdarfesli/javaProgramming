package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Alex";
        dog1.breed = "Husky";
        dog1.age = 15;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";

        System.out.println(dog1);

        Dog dog2 = new Dog();
        dog2.setInfo("Tony", "K9", 5, 'M', "large", "black");
        System.out.println(dog2);
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        Dog dog5 = new Dog();
        dog3.setInfo("Jay", "doberman", 3, 'F', "small", "pink");
        dog4.setInfo("Kral", "süs", 1, 'M', "small", "cream");
        dog5.setInfo("Yetiş", "kangal", 3, 'M', "Medium", "Brown");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};
        ArrayList<Dog> femaleDogs = new ArrayList<>();
        ArrayList<Dog> maleDogs = new ArrayList<>();

        for (Dog eachdog : dogs) {
            if (eachdog.gender == 'F') {
                femaleDogs.add(eachdog);
            }
        }
        maleDogs.addAll(Arrays.asList(dogs));
        maleDogs.removeAll(femaleDogs);
        System.out.println(femaleDogs.size());
        System.out.println(maleDogs.size());
    }
}
