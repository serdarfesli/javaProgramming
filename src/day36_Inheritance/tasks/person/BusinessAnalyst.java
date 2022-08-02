package day36_Inheritance.tasks.person;

public class BusinessAnalyst extends Employee{
    public int yearsOfExperience;

    public void setInfo(String name, int age, char gender, int id, String jobTitle, double salary, int yearsOfExperience) {
        setInfo(name,age,gender,id,jobTitle,salary);
        this.yearsOfExperience = yearsOfExperience;
    }

    public String toString() {
        return "BusinessAnalyst{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }

}
