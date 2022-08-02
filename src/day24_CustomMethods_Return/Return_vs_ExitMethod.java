package day24_CustomMethods_Return;

public class Return_vs_ExitMethod {


        public static void main(String[] args) {
            displayMonth(15);
            System.out.println("Hello World");
        }
        public static void displayMonth(int number){
            if (number>12 || number<1){
                System.out.println("Invalid");
               return;  // exits the method
              // System.exit(0);  // terminates everything. 
            }

            String monthName = (number==1)? "January" :(number==2)? "February"  :(number==3)? "March" :(number==4)? "April"
                    :(number==5)? "May" :(number==6)? "June" :(number==7)?"July" :(number==8)? "August" :(number==9)?"September" :(number==10)?"October"
                    :(number==11)? "November" : "December";
            System.out.println(monthName);
        }




    }





