package day12_Scanners;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String fullName = input.nextLine();
        System.out.println("Please enter your building number");
        int buildingNumber = input.nextInt();
        System.out.println("Please enter your Street Name");
        input.nextLine();
        String streetName = input.nextLine();
        System.out.println("Please enter your City Name");
        String cityName = input.nextLine();
        System.out.println("Please enter your State");
        String state = input.next();
        System.out.println("Please enter your Zip Code");
        int zipCode = input.nextInt();
input.close();
        String shippingAddress = buildingNumber + " " + streetName + " " + cityName + " " + state + " " + zipCode;
        System.out.println("shippingAddress = " + shippingAddress);

    }
}
