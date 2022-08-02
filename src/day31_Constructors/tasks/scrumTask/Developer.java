package day31_Constructors.tasks.scrumTask;

public class Developer {
    public String name;
    public long employeeId;
    public String jobTitle;
    public double salary;

    public Developer(String name, long employeeId, String jobTitle, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void coding(){
        System.out.println(name+ " is coding.");
    }
    public void unitTesting(){
        System.out.println(name+ " is doing unitTesting.");
    }
    public void fixingBug(){
        System.out.println(name+ " is fixing bug.");
    }
}
