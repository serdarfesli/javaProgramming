package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Eric", 1001, 'M', "Manager", 3500, true);
        Employee employee2 = new Employee();
        employee2.setInfo("Jessica", 1002, 'F', "Product Owner", 2500, false);
        Employee employee3 = new Employee();
        employee3.setInfo("Jane", 1003, 'F', "Developer", 2500, true);
        Employee employee4 = new Employee();
        employee4.setInfo("Serdar", 1005, 'M', "SDET", 2000, true);
        Employee employee5 = new Employee();
        employee5.setInfo("Tom", 1006, 'M', "Scrum Master", 3000, false);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
        ArrayList<Employee> employeeArrayList = new ArrayList<>(Arrays.asList(employees));
        employeeArrayList.removeIf(p -> p.isFullTime == false);
        System.out.println(employeeArrayList.size());
        employeeArrayList.clear();
        employeeArrayList.addAll(Arrays.asList(employees));
        double max = employeeArrayList.get(0).salary;
        double min = employeeArrayList.get(0).salary;
        for (Employee each : employeeArrayList) {
            if (each.salary > max) {
                max = each.salary;
            }
        }
        System.out.println(max);
        for (Employee each : employeeArrayList) {
            if (each.salary < min) {
                min = each.salary;
            }
        }
        System.out.println(min);
    }
}