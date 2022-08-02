package day15_forLoops;

public class Alphabet {
    public static void main(String[] args) {

        for (char letter = 'A'; letter <= 'Z'; letter++ ){
            System.out.print(letter + " ");
        }
        System.out.println();
        System.out.println("-----------------");
        for (char letter2 ='a'; letter2<='z'; letter2++){
            System.out.print(letter2 + " ");
        }
        System.out.println();
        System.out.println("-----------------");
        for (char letter3='Z'; letter3>='A'; letter3--){
            System.out.print(letter3 + " ");
        }
        System.out.println();
        System.out.println("-----------------");
        for (char letter4='z'; letter4>='a';letter4--){
            System.out.print(letter4 +" ");
        }





    }
}
