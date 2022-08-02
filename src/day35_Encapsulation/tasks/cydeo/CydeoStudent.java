package day35_Encapsulation.tasks.cydeo;

public class CydeoStudent {
    public String name;
    public char gender;
    public int age, batchNumber,groupNumber;
    public String secretCode;

    public static String schoolName, fieldOfStudy,programmingLanguage;

    static {
        schoolName="Cydeo";
        fieldOfStudy="SDET Course";
        programmingLanguage="Java";
    }

    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, String secretCode) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.secretCode = secretCode;
    }

    public static void printSchoolName(){
        System.out.println("schoolName = " + schoolName);
    }

    public void printSecretCode(){
        System.out.println("secretCode = " + secretCode);
    }

    public void attendClass(){
        System.out.println(name+" is atending the class in "+ schoolName);
    }

    public void study(){
        System.out.println(name+" is studying");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", secretCode='" + secretCode + '\'' +
                '}';
    }

}
/*
Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */