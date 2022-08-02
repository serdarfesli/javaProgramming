package LiveReviewSessionsWeek03;

public class LogicalOperator02 {
    public static void main(String[] args) {

        int b=2;
        boolean res = ++b == 2||--b == 2 && --b ==2;
 //                    false     true
        System.out.println("res = " + res); //false
        System.out.println("b = " + b); // 1 chceking the right side
    }
}
