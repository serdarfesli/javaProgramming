package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));

        ArrayList<Integer> unique = new ArrayList<>(list);
      /*  for (int i = 0; i < list.size(); i++) {
           if (Collections.frequency(list,list.get(i))==1){
               unique.add(list.get(i));
           }
        }
        System.out.println(unique);*/
        //2. solution
        unique.removeIf(p -> Collections.frequency(unique,p)>1);
        System.out.println(unique);

    }
}
