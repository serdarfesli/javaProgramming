package day35_Encapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("", 'A', 125, -80000);
        System.out.println(employee1);
Employee employee2 = new Employee("Aygün",'F',24,5000);
        System.out.println(employee2);
employee2.setAge(35);
        System.out.println(employee2);

    }
}