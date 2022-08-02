package day12_Scanners;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please Enter your score");
        int grade = scan.nextInt();
        String result="";
        if(grade>=0 && grade<=100){
            result = (grade>90)? "A" :(grade>80)? "B" :(grade>70)? "C"  :(grade>60)? "D?" : "F";
        }else {
            result="doğru düzgün yaz şunu";
        }
        System.out.println("result = " + result);
    }
}
