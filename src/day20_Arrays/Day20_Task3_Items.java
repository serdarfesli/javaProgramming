package day20_Arrays;

public class Day20_Task3_Items {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        String eachItem = "";
        boolean isContainiPad = false;
        String report="";
        for (int i = 0; i < items.length; i++) {
            eachItem = items[i];
            if (eachItem.equals("Gloves")) {
                System.out.println("index of Gloves:" + i);     //Task 3.1
            }
            isContainiPad = eachItem.equals("iPad");     //Task 3.2
            if (isContainiPad == true) {
                System.out.println(true);
            } else {
                continue;
            }
            report += items[i] +" - " + prices[i] + " - " + itemIDs[i] + "\n"; //Task3.3
        }




        System.out.println(report);
    }
}
/*
Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID
 */