package day35_Encapsulation.tasks.scrumTeam;

public class Developer {
    private String name;
    private int employeeID;
    private String jobTitle;
    private double salary;

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
    } //conds added
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public void setSalary(double salary) {
        if (salary<0){
            System.err.println("Invalid Salary");
            return;
        }
        this.salary = salary;
    } //conds. added

    public Developer(String name, int employeeID, String jobTitle, double salary) {
        setName(name);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    } //constructor

    public void coding(){
        System.out.println(name+" is coding");
    }
    public void unitTesting(){
        System.out.println(name+" is unitTesting");
    }
    public void fixingBug(){
        System.out.println(name+" is fixing bug");
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    } //toString
}
