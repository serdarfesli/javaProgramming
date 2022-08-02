package day36_Inheritance.tasks.person;

public class Tester extends Employee{
    public String programmingLanguage;
    public int yearsOfExperience;

    public void setInfo(String name, int age, char gender, int id, String jobTitle, double salary, String programmingLanguage, int yearsOfExperience) {
        setInfo(name, age, gender,id,jobTitle,salary);
        this.programmingLanguage = programmingLanguage;
        this.yearsOfExperience = yearsOfExperience;

    }
    public void creatingTicket (){
        System.out.println(name + " creating Ticket");
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }
}
