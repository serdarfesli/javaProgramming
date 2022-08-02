package day09_IfElse;

public class EqualNumbers {
    public static void main(String[] args) {
        int n1 = 1115,
                n2 = 1115,
                n3 = 15;
        String Message;
        if (n1 == n2 && n2 == n3) {
            Message = "All Equal";
        } else if (n1 == n2 && n1 != n3) {
            Message = "n1&n2 are equal";
        } else if (n1 == n3 && n1 != n2) {
            Message = "n1&n3 are equal";

        } else if (n2 == n3 && n1 != n2) {
            Message = "n2&n3 are equal";
        } else {
            Message = "none of them are equal";
        }
        System.out.println(Message);

    }
}
