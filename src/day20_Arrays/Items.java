package day20_Arrays;

import java.util.Scanner;

public class Items {
    public static void main(String[] args) {
        String [] items = new String[5];
        int [] prices = new int[5];
        Scanner scan = new Scanner(System.in);
        int totalPrice=0;
        String display="";
        for (int i = 0; i < items.length; i++) {
            System.out.println("Please enter item " + (i+1));
            items[i]= scan.next();
        }
        for (int i = 0; i < prices.length; i++) {
            System.out.println("Please enter price " + (i+1));
            prices[i]= scan.nextInt();
            totalPrice+=prices[i];
        }
        for (int i = 0; i <items.length ; i++) {
            display+= items[i] + " : " + prices[i] + "\n";
        }
        System.out.println(display);
        System.out.println("totalPrice = " + totalPrice);
    }
}
