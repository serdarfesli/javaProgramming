package day35_Encapsulation.tasks.scrumTeam;

public class Tester {
    private String name;
    private int employeeID;
    public String jobTitle;
    public double salary;

    public String getName() {
        return name;
    }
    public int getEmployeeID() {
        return employeeID;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public double getSalary() {
        return salary;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setEmployeeID(int employeeID) {
        if (employeeID<=0){
            System.err.println("Invalid EmployeeID");
            return;
        }
        this.employeeID = employeeID;
    } //conds. added
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public void setSalary(double salary) {
       if (salary<0){
           System.err.println("salary cannot be 0");
           return;
       }
        this.salary = salary;
    } //conds. added

    public Tester(String name, int employeeID, String jobTitle, double salary) {
        setName(name);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }//constructor

    public void smokeTesting(){
        System.out.println(name + " is doing Smoke Testing");
    }
    public void creatingTicket(){
        System.out.println(name+ " is creating ticket");
    }
    public void dailyStandup(){
        System.out.println(name + " is attending daily standup");
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    } //tostring
}
