package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setInfo("Ali", 'M', 13, 1000, 'A');
        Student student2 = new Student();
        student2.setInfo("Hülya", 'F', 26, 1001, 'B');
        Student student3 = new Student();
        student3.setInfo("Allen", 'F', 21, 1006, 'F');
        Student student4 = new Student();
        student4.setInfo("Mert", 'M', 24, 1004, 'C');
        Student student5 = new Student();
        student5.setInfo("Cihan", 'M', 14, 1002, 'A');

        Student[] students ={student1,student2,student3,student4,student5};
        for (Student each : students) {
            System.out.println(each);
        }
        System.out.println("---------------------------------");
        ArrayList<Student> earlyBird= new ArrayList<>(Arrays.asList(students));
        ArrayList<Student> angryBirds= new ArrayList<>(Arrays.asList(students));
            earlyBird.removeIf(p-> p.grade!='A');
            angryBirds.removeIf(p->p.grade=='A');

        System.out.println("earlyBird = " + earlyBird);
        System.out.println("earlyBird's number = " + earlyBird.size());

        System.out.println("angryBirds = " + angryBirds);
        System.out.println("angryBird's number = " + angryBirds.size());


    }
}
