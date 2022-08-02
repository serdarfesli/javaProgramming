package day36_Inheritance.warmUp;

public class Student {
    private String name;
    private int age;
    private char gender, grade;
    private String schoolName;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public char getGrade() {
        return grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 5 || age > 90) {
            System.err.println("Invalid age");
            return;
        }
        this.age = age;
    }//conds added

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            System.err.println("Invalid Gender");
            return;
        }
        this.gender = gender;
    }//conds added

    public void setGrade(char grade) {
        if (!(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')) {
            System.err.println("Invalid Grade");
            return;
        }
        this.grade = grade;
    } // conds added

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setSchoolName(schoolName);
        setGrade(grade);
    }//constructor

    public void study() {
        System.out.println(name + " is studying");
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + getGrade() +
                ", schoolName='" + schoolName + '\'' +
                '}';
    } //toString
}
