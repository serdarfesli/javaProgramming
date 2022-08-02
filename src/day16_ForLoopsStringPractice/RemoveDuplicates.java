package day16_ForLoopsStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {


        String str1 = "AABBCCAABCCCCBAAABBCACJKLJASDLAKSJD";

          String unique = "";
        for (int i = 0; i <= str1.length()-1 ; i++) {
            if(unique.indexOf(str1.charAt(i))<0){
                unique+= str1.charAt(i);
            }
        }
        System.out.println("unique = " + unique);

    }
}
