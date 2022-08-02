package day36_Inheritance.tasks.person;

public class Employee extends Person{
    public int id;
    public String jobTitle;
    public double salary;

    public void setInfo(String name, int age, char gender, int id, String jobTitle, double salary) {
        setInfo(name,age,gender);
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void work(){
        System.out.println(name + " is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    } //toString


}
