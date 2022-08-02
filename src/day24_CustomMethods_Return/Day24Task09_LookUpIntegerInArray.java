package day24_CustomMethods_Return;

public class Day24Task09_LookUpIntegerInArray {
    public static void main(String[] args) {

        System.out.println(    integerInArray(new int[]{1,2,3,4},1)  );

    }

    public static boolean integerInArray (int[] arr,int number){
        boolean isIntegerExist = false;
        for (int each : arr) {
            if (number==each){
                isIntegerExist = true;
            }
        }
        return isIntegerExist;
    }
}
/*
9. Create a method named contains that passes one integer array and one integer parameters, the method returns true if the given integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false
 */