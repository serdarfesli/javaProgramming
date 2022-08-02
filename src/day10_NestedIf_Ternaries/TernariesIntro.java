package day10_NestedIf_Ternaries;

public class TernariesIntro {
    public static void main(String[] args) {
        int n = 100;
        if (n % 2 == 0) {
            System.out.println("even");  //String
        } else {
            System.out.println("odd");   //String
        }


        System.out.println("----------------");
        String result1;
        result1 = (n % 2 == 0) ? "Even" : "Odd";

        System.out.println(result1);

        System.out.println("----------------");



int age =23;

/*
if(age>=21){
    System.out.println("eligible");
}else {
    System.out.println("not eligible");
}
     */
        String message= (age>=21)? "eligible" : "not eligible";

        System.out.println(message);


    }

}










