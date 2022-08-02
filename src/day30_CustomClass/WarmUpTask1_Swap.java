package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTask1_Swap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Ali", "Veli", "James", "Java"));
        Collections.swap(list, 0, list.size() - 1);
        System.out.println(list);
    }
}
