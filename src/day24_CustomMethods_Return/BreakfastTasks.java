package day24_CustomMethods_Return;

public class BreakfastTasks {
    public static void main(String[] args) {
        displayInitials("Serdar","Fesli");
domainOfEmail("serdarfesli@gmail.com");
displayMonth(11);
displayDay(2);

    }

    public static void displayInitials(String firstName,String lastName){
        String initials = firstName.substring(0,1)+","+lastName.substring(0,1);
        System.out.println(initials);
    }

public static void domainOfEmail(String email){
        String domain= email.substring(email.indexOf("@")+1, email.indexOf("."));
    System.out.println(domain);
}
public static void displayMonth(int number){
    String monthName = (number==1)? "January" :(number==2)? "February"  :(number==3)? "March" :(number==4)? "April"
:(number==5)? "May" :(number==6)? "June" :(number==7)?"July" :(number==8)? "August" :(number==9)?"September" :(number==10)?"October"
    :(number==11)? "November":(number==12)? "December" :"Invalid Number please enter a number betweem 1 to 12";
    System.out.println(monthName);
}
public static void displayDay(int numberOfDay){
    String nameOfDay = (numberOfDay==1)? "Monday" :(numberOfDay==2)? "Tuesday"  :(numberOfDay==3)? "Wednesday" :(numberOfDay==4)? "Thursday"
            :(numberOfDay==5)? "Friday" :(numberOfDay==6)? "Saturday" :(numberOfDay==7)?"Sunday" : "Invalid number";
    System.out.println(nameOfDay);
}

}
