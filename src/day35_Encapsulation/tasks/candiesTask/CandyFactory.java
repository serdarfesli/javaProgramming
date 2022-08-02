package day35_Encapsulation.tasks.candiesTask;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {
        Candy candy1 = new Candy("ülker",20,0,false);
        Candy candy2 = new Candy("kent",15,2,true);
        Candy candy3 = new Candy("ülker",10,5,false);
        Candy candy4 = new Candy("eti",20,12,true);
        Candy candy5 = new Candy("şokella",15,5,false);

        ArrayList<Candy> candyList = new ArrayList<>();
        candyList.addAll(Arrays.asList(candy1,candy2,candy3,candy4,candy5));
        for (Candy eachCandy : candyList) {
            System.out.println(eachCandy.getBrand() + " , "+eachCandy.getPrice());

        }
    }
}
