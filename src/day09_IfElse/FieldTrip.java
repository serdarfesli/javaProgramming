package day09_IfElse;

public class FieldTrip {
    public static void main(String[] args) {
        int gradeNumber =6;
        String message;
        if(gradeNumber==1){
            message="location -  Apple orchard \nnumber of groups - 3 \nteacher in charge - Ms. Smith";
        } else if (gradeNumber==2){
            message="location - Zoo \nnumber of groups - 3 \nteacher in charge - Mr. Lee";
        } else if (gradeNumber==3){
            message="location - Aquarium \nnumber of groups - 5 \nteacher in charge - Ms. Wilson";
        }else if (gradeNumber==4){
            message="location - Movie theater \nnumber of groups - 2 \nteacher in charge - Ms. Reyes";
        }else if (gradeNumber==5){
            message="location - Museum \nnumber of groups - 5 \nteacher in charge - Ms. Lela";
        } else {
            message="location - Six Flags \nnumber of groups - 8 \nteacher in charge - Mr. Watt";
        }
        System.out.println(message);
    }
}
