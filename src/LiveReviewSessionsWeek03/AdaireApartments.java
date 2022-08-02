package LiveReviewSessionsWeek03;

import java.rmi.ServerError;
import java.util.Scanner;

public class AdaireApartments {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the floor");
        int floorNumber = input.nextInt();
        /*if (floorNumber == 1){
            System.out.println("You are living at First Floor");
        } else if (floorNumber==2){
            System.out.println("You are living at Second Floor");
            }else if (floorNumber==3){
            System.out.println("You are living at Third Floor");
        }else {
            System.err.println("no such floor");*/
       switch (floorNumber){
           case 1:
               System.out.println("You are living at First Floor");
               break;
           case 2:
               System.out.println("You are living at Second Floor");
               break;
           case 3:
               System.out.println("You are living at Third Floor");
               break;
           default:
               System.err.println("no such floor");
        }

   input.close();
    }
}

