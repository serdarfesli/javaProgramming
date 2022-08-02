package day17_BranchingStatementsWhileDo_WhileLoops;

import java.util.Scanner;

public class RommReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int priceForRoom = 0;
        String roomChosen = "";
        System.out.println("Do you want to reserve a room? Yes/No");
        String answerForRoom = scan.next().toLowerCase();
        while (!(answerForRoom.equals("yes") || answerForRoom.equals("no"))) {
            System.out.println("Please re-enter a valid answer. Yes/No");
            answerForRoom = scan.next().toLowerCase();
        }
        if (answerForRoom.equals("yes")) {
            System.out.println("which type of room the do you want to reserve?");
            scan.nextLine();
            roomChosen = scan.nextLine().toLowerCase();
            while (!(roomChosen.equalsIgnoreCase("King Bed") || roomChosen.equalsIgnoreCase("Queen Bed") || roomChosen.equalsIgnoreCase("single Bed"))) {
                System.out.println("Please re-enter a valid room type");
                roomChosen = scan.nextLine().toLowerCase();
            }
            if (roomChosen.equalsIgnoreCase("King Bed")) {
                priceForRoom = 120;
            } else if (roomChosen.equalsIgnoreCase("Queen Bed")) {
                priceForRoom = 100;
            } else {
                priceForRoom = 80;
            }
            System.out.println("roomChosen = " + roomChosen);
            System.out.println("priceForRoom = " + priceForRoom);

        } else {
            System.out.println("have a nice day");
        }
    }
}



/*
Create a class called RommReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */