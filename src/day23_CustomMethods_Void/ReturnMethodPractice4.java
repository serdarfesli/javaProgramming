package day23_CustomMethods_Void;

public class ReturnMethodPractice4 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("Javaaaaaaaaaeeeeeeeeeee"));








    }
    public static String removeDuplicates (String word){
        String container="";
        int count=0;
        for (int i = 0; i <word.length() ; i++) {
            if (container.contains(""+word.charAt(i))){
                continue;
                }else{
                container+=""+word.charAt(i);
            }
        }
        return container;



    }
}
/*
1. create a method that can remove duplciated characters from a string and returns the new value
					"aaabbcccc" ===> "abc"
 */