package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {
        int number=100;
        System.out.println("numner = " + number);
number=200;
        System.out.println("number = " + number);

String word ="Java Programming";
        System.out.println("word = " + word);
        word="wooden spoon";
        System.out.println("word = " + word);
        word="Serdar";
        System.out.println("word = " + word);

int x=200;
x=x-100;
x+=200;
        System.out.println("x = " + x);

        String Name ="Serdar";
        Name += " Fesli";
        System.out.println("Name = " + Name);
        Name += " Fesli";
        System.out.println("Name = " + Name);

        double luckyNumber=5.5;
        luckyNumber +=2.5;
        System.out.println("luckyNumber = " + luckyNumber);

        luckyNumber +=500;
        System.out.println("luckyNumber = " + luckyNumber);

        luckyNumber -=300;
        System.out.println("luckyNumber = " + luckyNumber);

       double dodgecoin=0.0002;
       dodgecoin*=530;
        System.out.println("dodgecoin = " + dodgecoin);
luckyNumber /=2;
        System.out.println("luckyNumber = " + luckyNumber);

        int amount=127;
        int quarters=amount/25;
        int cents=amount%25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);


        int y=300;
        y %=16;
        System.out.println("y = " + y);



    }
    }
