package myUtilities;

public class MyMathUtility {

 public static int sumOf2Num(int num1,int num2){
     return num1+num2;
 }  // returns sum of two int
    public static double sumOf2Num(double num1,double num2){
        return num1+num2;
    }   // returns sum of two double


    public static int subtractionOf2Num(int num1,int num2){
        return num1-num2;
    }  // returns subtraction of two int
    public static double subtractionOf2Num(double num1,double num2){
        return num1-num2;
    }   // returns subtraction of two double


    public static int multiplicationOf2Num(int num1,int num2){
        return num1*num2;
    }  // returns multiplication of two int
    public static double multiplicationOf2Num(double num1,double num2){
        return num1*num2;
    }   // returns multiplication of two double


    public static double divisionOf2Num(double num1,double num2){
        return num1/num2;
    }   // returns division of two double


public static boolean isEven (int num1){
    boolean result=false;
     if (num1%2==0){
         result=true;
     }
     return result;
}  //checks the number is even,returns boolean
    public static boolean isOdd (int num1){
        boolean result=false;
        if (num1%2==1){
            result=true;
        }
        return result;
    }  //checks the number is odd,returns boolean


public static int maxNum (int num1,int num2) {
    if (num1 >= num2) {
        return num1;
    } else {
        return num2;
    }
} // returns the max int number
    public static double maxNum (double num1,double num2){
        if(num1>=num2){
            return num1;
        } else{
            return num2;
        }
} // returns the max double number

    public static int minNum (int num1,int num2) {
        if (num1 <= num2) {
            return num1;
        } else {
            return num2;
        }
    } // returns the min int number
    public static double minNum (double num1,double num2){
        if(num1<=num2){
            return num1;
        } else{
            return num2;
        }
    } // returns the min double number

public static int squareOfNum (int num1){
     return num1*num1;
}
    public static double squareOfNum (double num1){
        return num1*num1;
    }

    public static int cubeOfNum (int num1){
        return num1*num1*num1;
    }
    public static double cubeOfNum (double num1){
        return num1*num1*num1;
    }

}
