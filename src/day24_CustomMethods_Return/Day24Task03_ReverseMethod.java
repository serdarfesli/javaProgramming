package day24_CustomMethods_Return;

public class Day24Task03_ReverseMethod {
    public static void main(String[] args) {

        System.out.println( reverse("Java")  );
    }
    public static String reverse(String str1){
String reverse="";
        for (int i = str1.length()-1; i >=0 ; i--) {
            reverse+=""+str1.charAt(i);
        }
        return reverse;
    }

}
/*
3. create a method named reverse that passes one string parameter, the method can return the reversed string

				Ex:
					str = "Java";

					reverse(str) ==> avaJ
 */