package day20_Arrays;
import java.util.Arrays;
public class Day20_Task4_Grades {
    public static void main(String[] args) {

        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];
        char eachchar =' ';
        int eachScore=0;
        for (int i = 0; i < names.length; i++) {
            eachScore=scores[i];

            if (eachScore>=90) {
                eachchar ='A';
            } else if (eachScore>=80 && eachScore<90) {
                eachchar ='B';
            } else if (eachScore>=70 && eachScore<80) {
                eachchar ='C';

            }else if (eachScore>=60 && eachScore<70) {
                eachchar ='D';
        }else {
                eachchar = 'F';
            }
            grades[i]= eachchar;
            System.out.println(names[i]+"'s score is "+eachScore+", and grade is "+ eachchar);
        }
        System.out.println(Arrays.toString(grades));
    }
}


/*
given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A
 */