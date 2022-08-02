package day14_Strings;

public class StringMethods2 {
    public static void main(String[] args) {
        String str1 = " I love Java and I am going to learn Java";
        String str2 = str1.replace("Java", "Phyton");
        System.out.println("str1 = " + str1);//str1 =  I love Java and I am going to learn Java
        System.out.println("str2 = " + str2);//str2 =  I love Phyton and I am going to learn Phyton
        String email = "JohnSmith@yahoo.com";
        email = email.replace("yahoo", "gmail");
        System.out.println("email = " + email);//email = JohnSmith@gmail.com

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        sentence = sentence.replace("Python", "");
        System.out.println("sentence = " + sentence);
        sentence = sentence.replace("  ", " ");
        System.out.println("sentence = " + sentence);

        System.out.println("----------------");

        String result = "Java Java Java";
        result = result.replaceFirst("Java", "Phython");
        System.out.println("result = " + result);//result = Phython Java Java

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#", "Java");
        System.out.println("result2 = " + result2);


    }
}
