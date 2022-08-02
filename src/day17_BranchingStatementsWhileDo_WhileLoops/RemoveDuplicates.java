package day17_BranchingStatementsWhileDo_WhileLoops;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AABBCCDDFGGRGGDGSGDSGSDSGSDGSDGSDGEWEFZX";

        String result = "";
        for (int i = 0; i <str.length() ; i++) {
            String cha = "" + str.charAt(i);
            if(result.contains(cha)){
                continue;
            }
            result += cha;
        }
        System.out.println(result);




    }
}
