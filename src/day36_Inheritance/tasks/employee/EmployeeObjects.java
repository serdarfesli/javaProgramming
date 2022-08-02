package day36_Inheritance.tasks.employee;

public class EmployeeObjects {
    public static void main(String[] args) {
        Driver driver1 = new Driver();
        driver1.setInfo("ali",'F',12,"QA",1234,2000,"Apple");
        driver1.work();
        Tester tester1 = new Tester();
        tester1.work();
        tester1.testing();
        tester1.creatingTicket();
        System.out.println(tester1);
        Developer developer1 = new Developer();
        Teacher teacher1 = new Teacher();
        teacher1.teaching();
        developer1.work();


    }
}
