package day13_String;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age please");
        int age = input.nextInt();
        System.out.println("Enter your gender please");
        String gender = input.next();
        System.out.println("Enter your full name please");
        input.nextLine();
        String fullName = input.nextLine();
        System.out.println("Enter your phone number  please");
        long phoneNumber = input.nextLong();
        System.out.println("Enter your zip code please");
        int zipCode = input.nextInt();
        System.out.println("Enter your School Name please");
        input.nextLine();
        String schoolName = input.nextLine();
        System.out.println("Enter your City name please");
        String cityName = input.nextLine();
        System.out.println("Enter your State name please");
        String stateName = input.next();
        System.out.println("Enter your building number please");
        int buildingNumber = input.nextInt();
        System.out.println("Enter your Street name please");
        input.nextLine();
        String streetName = input.nextLine();
        System.out.println("1. " + fullName + "\n2. " + age + "\n3. " + gender + "\n4. " + phoneNumber + "\n5. adress: \n\t"+
          buildingNumber +" " +streetName +"\n\t" + cityName +", "+stateName + " " + zipCode  + "\n6. " + schoolName);

        input.close();
    }

}
