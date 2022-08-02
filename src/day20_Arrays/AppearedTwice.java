package day20_Arrays;

public class AppearedTwice {
    public static void main(String[] args) {
        char[] chars ={'A','A','B','C','C','D','D','D'};
String appearedTwice ="";
        for (int i = 0; i < chars.length; i++) {
            int frq =0;
             char element1=chars[i];
            for (int j = 0; j < chars.length; j++) {
                char element2=chars[j];
                if (element1==element2){
                    frq++;
                }
            }
            if (frq==2 && !(appearedTwice.contains("" + element1))){
                appearedTwice+="" + element1;
            }
        }
        System.out.println("appearedTwice = " + appearedTwice);

    }
}
