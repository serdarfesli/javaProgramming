package day31_Constructors.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieObjects {
    public static void main(String[] args) {
        Movie movie1 = new Movie("USA","Journey to SDET: Cydeo Batch EU9","Adventure, Comedy, Thriller","10/25/2021","Alex Muhtar");
        String[] strArr ={"Ali","Ahmet","Asya"};
        movie1.addCasts(strArr);
        System.out.println(movie1);




    }




}
