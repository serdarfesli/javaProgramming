package day07_Operators;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2020;
        int remainder = year % 4;
        boolean leapyear = remainder == 0;
        System.out.println(year + " is a " + "leapyear " + leapyear);

    }

}
