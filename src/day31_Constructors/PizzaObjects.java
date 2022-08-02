package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaObjects {

    public static void main(String[] args) {
        ArrayList<Pizza> pizzaList = new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            Pizza small = new Pizza('S', 2, 3);
            Pizza medium = new Pizza('M', 3, 4);
            Pizza large = new Pizza('L', 4, 5);
            pizzaList.addAll(Arrays.asList(small,medium,large));
        }

        System.out.println(pizzaList.size());
        double totalCost=0;
        for (Pizza eachpizza : pizzaList) {
            totalCost+= eachpizza.calcCost();
        }





    }
}
