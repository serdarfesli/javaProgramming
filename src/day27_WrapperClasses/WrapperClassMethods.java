package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String str = "123";
        String str2= "may true";
        int num = Integer.parseInt(str);
        int num2 = num + 1;
        System.out.println(num2);

        double num3 = Double.parseDouble(str);
        System.out.println(num3);
        num3=5;
        System.out.println(num3);

        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);

        String str3= "1234";
        //int num5=Integer.valueOf(str3);
        System.out.println(Integer.valueOf(str3));

        String str4= "1234.5";
        double d1= Double.valueOf(str3);
        System.out.println(d1);


        char ch ='1';
        boolean result =Character.isDigit(ch);
        System.out.println(result);

        boolean result2 =Character.isLetter(ch);
        System.out.println(result);


    }
}
