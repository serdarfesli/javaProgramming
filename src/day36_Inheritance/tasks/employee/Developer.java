package day36_Inheritance.tasks.employee;

public class Developer extends Employee{
    public void coding(){
        System.out.println(name + " is coding");
    }
    public void fixingBugs(){
        System.out.println(name + " is fixing Bugs");
    }
}
