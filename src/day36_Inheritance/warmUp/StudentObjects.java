package day36_Inheritance.warmUp;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Ali", 4, 'M', 'A', "Cydeo");
        System.out.println(student1);
        student1.setAge(15);
        System.out.println(student1);
        student1.setGrade('G');
        System.out.println("----------");
        System.out.println(student1);
        student1.setGrade('B');
        System.out.println(student1);



    }
}
