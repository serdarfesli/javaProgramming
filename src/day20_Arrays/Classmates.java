package day20_Arrays;

import java.util.Scanner;

public class Classmates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String initials="";
        String [] classmates = new String[10];
        for (int i = 0; i < classmates.length; i++) {
            System.out.println("Enter the full name of friend "  + (i+1));
            classmates[i]= scan.nextLine();
            initials+= "" + classmates[i].charAt(0) + classmates[i].charAt(classmates[i].lastIndexOf(" ")+1) + "\n" ;
        }
        System.out.println("initials = " + initials);


    }
}
/*
create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */