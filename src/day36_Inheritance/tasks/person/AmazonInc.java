package day36_Inheritance.tasks.person;

import java.util.ArrayList;

public class AmazonInc {
    public static void main(String[] args) {

        ProductOwner productOwner1 = new ProductOwner();
        BusinessAnalyst businessAnalyst1 = new BusinessAnalyst();
        ScrumMaster scrumMaster1 = new ScrumMaster();

        Tester tester1 = new Tester();
        Tester tester2 = new Tester();
        Tester tester3 = new Tester();
        Tester tester4 = new Tester();
        Tester[] testers = {tester1, tester2, tester3, tester4};
        tester1.setInfo("Ali", 24, 'M', 11111, "QA", 2000, "java", 2);
        tester2.setInfo("Veli", 24, 'M', 12222, "QA", 2000, "java", 2);
        tester3.setInfo("Cihan", 27, 'M', 13333, "QA", 2000, "java", 2);
        tester4.setInfo("James", 25, 'M', 14444, "QA", 2000, "java", 2);
        Tester[] testerArr = {tester1, tester2, tester3, tester4};

        Developer developer1 = new Developer();
        developer1.setInfo("Ali", 45, 'M', 27777, "Dev", 5000, "java", 8);
        Developer developer2 = new Developer();
        developer2.setInfo("Jack", 45, 'M', 28888, "Dev", 5000, "java", 8);
        Developer developer3 = new Developer();
        developer3.setInfo("Mary", 45, 'F', 29999, "Dev", 5000, "java", 8);
        Developer developer4 = new Developer();
        developer4.setInfo("Nicole", 50, 'M', 26666, "Dev", 5000, "java", 8);
        Developer[] devArr = {developer1, developer2, developer3, developer4};

        ScrumTeam scrumTeam1 = new ScrumTeam();

        scrumTeam1.productOwner = productOwner1;
        productOwner1.setInfo("Hasan", 35, 'M', 99999, "PO", 10000, 9);
        scrumTeam1.scrumMaster = scrumMaster1;
        scrumMaster1.setInfo("Susan", 48, 'F', 55555, "SM", 5000, 5);
        scrumTeam1.businessAnalyst = businessAnalyst1;
        businessAnalyst1.setInfo("Bayram", 65, 'M', 44444, "BA", 4000, 4);
        scrumTeam1.testersList = new ArrayList<>();
        scrumTeam1.developersList = new ArrayList<>();

        scrumTeam1.addTesters(testers);
        scrumTeam1.addDevelopers(devArr);

        System.out.println(scrumTeam1);
    }
}