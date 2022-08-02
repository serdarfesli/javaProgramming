package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aaabcccdeef";
        String unique="";
        String[] arr = str.split("");
        ArrayList<String> list=new ArrayList<>(Arrays.asList(arr));
        list.removeIf(p-> Collections.frequency(list,p)>1);
        for (String each : list) {
             unique+= each;
        }
        System.out.println("unique = " + unique);


    }

}
