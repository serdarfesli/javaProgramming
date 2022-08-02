package day09_IfElse;

public class LeapYear {
    public static void main(String[] args) {
        int year =2001;
        boolean leapYear = year%4 == 0;

        if(leapYear){
            System.out.println(year + " is a leap year.");
        }else{
            System.out.println(year + " is not a leap year.");
        }


    }
}
