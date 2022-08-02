package day14_Strings;

public class DomainOfTheEmail_Substring {
    public static void main(String[] args) {
        String email="Cydeo.School@gmail.com";
        String domain= email.substring((email.indexOf("@") +1),(email.lastIndexOf(".")));
        System.out.println("domain = " + domain);


        String str1="Java is fun, Java is cool";
        String s1= str1.substring(0,(str1.indexOf(",")));
        System.out.println("s1 = " + s1);
    }
}
