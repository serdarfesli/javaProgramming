package day12_Scanners;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter you total share you already have");
        int totalShareYouAlreadyHave = input.nextInt();
        if (totalShareYouAlreadyHave > 0) {
            System.out.println("Please enter your total value");
            double totalValue = input.nextDouble();
            input.nextLine();
            System.out.println("Please enter the name of the company you have the most shares in");
            String nameOfCompany = input.nextLine();
            System.out.println("Your total stock market holding is $" + totalValue + " which is made up of "
                    + totalShareYouAlreadyHave +" shares. " + nameOfCompany + " is your company holdings");
        }
        input.close();
    }
}
/*
7. StockMarket task:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"
 */