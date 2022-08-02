package LiveReviewSessionsWeek03;

public class UnaryOperatorExamples {
    public static void main(String[] args) {
        int a =25;
        System.out.println(++a);//26
        System.out.println(--a);//25
int b =25;
        System.out.println(b++);//25  first use the value then increase.
        System.out.println(b--);//26 first use the value then decrease
        System.out.println(b);


a =50;
a = --a+ a++ + a-- + a++; //49+49+50+49

        System.out.println("a = " + a);

        int x = 4;
        int y = x * 4 - x++; //

        System.out.println("y = " + y);

boolean b1 =true;
        System.out.println(!b1);




    }

}
