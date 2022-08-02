package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int number = 15;
        String result = "";
        switch (number) {

            case 1:   case 3:      case 5: case 7:    case 8:  case 10:  case 12:
                result = "31 Days";
                break;
            case 2:
                result = "28 Days";
                break;
            case 4:  case 6:  case 9:   case 11:
                result= "30 Days";
                break;
            default:
                result="Invalid";
                break;

        }
        System.out.println("result = " + result);

    }
}
