package day09_IfElse;

public class OxygenTank {
    public static void main(String[] args) {
        int oxygenLevel = 90;
        String message;
        if (oxygenLevel > 90) {
            message = "Your tank is full";
        } else if (oxygenLevel > 80) {
            message = "Still okay";
        } else if (oxygenLevel > 70) {
            message = "Don't go too far";
        } else if (oxygenLevel > 60) {
            message = "Start to head back";
        } else if (oxygenLevel > 50) {
            message = "Be careful now you at at 50%";
        } else {
            message="!!!DANGER!!!";
        }
        System.out.println(message);
    }
}

