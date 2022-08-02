package day12_Scanners;

import java.util.Locale;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ROOT);
        System.out.println("Enter a number for radius");
        double radius = scan.nextDouble();
        double perimeter = 2 * 3.14 * radius;
        double area = radius * radius * 3.14;
        System.out.println("perimeter = " + perimeter + "\narea = " + area);
   scan.close();
    }
}
