package day21_ForEachLoop;

public class ForEachLoopPractice2_Reversed {
    public static void main(String[] args) {
        String [] words ={"Java Programming", "Wooden Spoon", "Early Birds","Angry Birds"};

        for (String each:words){
            String reversed="";
            for (int i = each.length()-1; i >=0 ; i--) {
               reversed+= each.charAt(i);
            }
            System.out.println(reversed);
        }
    }
}
