package day14_Strings;

import java.util.Scanner;

public class XcodeToCode {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a word");
        String str = input.next();
        if(str.charAt(0)=='x'){
            str=str.substring(1);
            System.out.println(str);
        }
    }
}
