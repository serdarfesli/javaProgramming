package day23_CustomMethods_Void;

public class CustomMethosWithParameters {
    public static void main(String[] args) {
oddOrEven(20);
ageOfPerson(1985);
betweenXAndY(20,50);
    }

    public static void oddOrEven(int number){
        if (number%2==0){
            System.out.println(number+" is even" );
        }else {
            System.out.println(number+" is odd");
        }
    }
public static void ageOfPerson(int birthOfDate){
    System.out.println(2022-birthOfDate);
}
public static void betweenXAndY(int numX,int numY){
    System.out.println(numX-numY);
}


}
