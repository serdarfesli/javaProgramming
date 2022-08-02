package day24_CustomMethods_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {

       int result= 2*returnMax(30,32);
        System.out.println(result);
    }

public static int returnMax(int num1,int num2){
        int maxNumber=0;
        if (num1>num2){
        maxNumber= num1;
        }else {
            maxNumber=num2;
        }
        return maxNumber;
}


}
