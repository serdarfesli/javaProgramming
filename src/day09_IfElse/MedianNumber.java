package day09_IfElse;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 100,
                b = 50,
                c = 80;
        boolean aIsTheMedianNumber = (c > a && a > b) || (b > a && a > c);
        boolean bIsTheMedianNumber = (c > b && b > a) || (a > b && b > c);
        boolean cIsTheMedianNumber = (b > c && c > a) || (a > c && c > b);

        if (aIsTheMedianNumber) {
            System.out.println(a + " is the median number.");
        }

        if (bIsTheMedianNumber) {
            System.out.println(b + " is the median number.");

        }

        if (cIsTheMedianNumber) {
            System.out.println(c + " is the median number.");
        }

    }
}

