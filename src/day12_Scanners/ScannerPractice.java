package day12_Scanners;


import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        byte num = (byte) scan.nextInt();
        String result = "";
        if (num >= 1 && num <= 7) {
           result = (num == 1)? "Monday" : (num == 2)? "Tuesday" :(num == 3)? "Wednesday" :(num == 4)? "Thursday"
                    :(num == 5)? "Friday" :(num == 6)? "Monday" : "Sunday";
        } else {
            result = "invalid Number";
        }

        System.out.println("result = " + result);
    }

}
