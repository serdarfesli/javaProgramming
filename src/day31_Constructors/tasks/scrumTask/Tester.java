package day31_Constructors.tasks.scrumTask;

public class Tester {
    public String name;
    public long employeeId;
    public String jobTitle;
    public double salary;

    public Tester(String name, long employeeId, String jobTitle, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=$" + salary +
                '}';
    }

    public void smokeTesting() {
        System.out.println(name + " is smoke testing");
    }

    public void creatingTicket() {
        System.out.println(name + " is creating ticket");
    }

    public void dailyStandUp() {
        System.out.println(name + " is attending daily standup meeting");
    }


}
