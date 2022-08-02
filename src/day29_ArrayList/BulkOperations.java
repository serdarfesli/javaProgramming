package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
    list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list);

        list.removeAll(Arrays.asList(3,5,8));
        System.out.println(list);

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list);

        list.retainAll(Arrays.asList(1,2,3));
        System.out.println(list);


        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll( Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA"));
        jobTitles.retainAll(Arrays.asList("SDET","QA"));
        System.out.println(jobTitles);


        list.clear();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list);
        boolean r= list.containsAll(Arrays.asList(2,3,11 ));
        System.out.println(r);










    }
}