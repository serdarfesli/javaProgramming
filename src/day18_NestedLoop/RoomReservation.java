package day18_NestedLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String roomReserved = "";
        int numberOfDay = 0;
        int totalPrice = 0;

        while (true) {

            System.out.println("which bedroom do you want to reserve?");

            roomReserved = scan.nextLine().toLowerCase();
            while (!(roomReserved.equalsIgnoreCase("King Bed") || roomReserved.equalsIgnoreCase("Queen Bed") ||
                    roomReserved.equalsIgnoreCase("Single Bed"))) {
                System.err.println("invalid entry, please re-enter a valid entry");
                roomReserved = scan.nextLine().toLowerCase();
            }

            System.out.println("how many nights are you staying?");
            numberOfDay = scan.nextInt();

            if (roomReserved.equalsIgnoreCase("King Bed")) {
                totalPrice = numberOfDay * 120;
            } else if (roomReserved.equalsIgnoreCase("Queen Bed")) {
                totalPrice = numberOfDay * 100;
            } else {
                totalPrice = numberOfDay * 80;
            }

            System.out.println("would you like to reserve another room? -> yes/no");
            String answerForAnotherRoom = scan.next().toLowerCase();
            while (!(answerForAnotherRoom.equalsIgnoreCase("yes") || answerForAnotherRoom.equalsIgnoreCase("no"))) {
                System.err.println("Please re-enter a valid entry-> yes/no");
                answerForAnotherRoom = scan.next().toLowerCase();
            }
            if (answerForAnotherRoom.equalsIgnoreCase("no")) {
                break;
            }
            scan.nextLine();
        }

        System.out.println("totalPrice = " + totalPrice);
        scan.close();
    }
}
