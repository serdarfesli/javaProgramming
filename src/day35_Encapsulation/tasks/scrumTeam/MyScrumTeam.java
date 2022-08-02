package day35_Encapsulation.tasks.scrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTeam {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Ahmet",12345,"QA",-5000);
        Tester tester2 = new Tester("Jesscia",32145,"QA",3000);
        Tester tester3 = new Tester("David",33145,"SDET",4000);
        Tester[] testerArr ={tester1,tester2,tester3};

        Developer developer1= new Developer("Jack",11111,"dev",10000);
        Developer developer2= new Developer("James",22222,"dev",11000);
        Developer developer3= new Developer("Jason",33333,"dev",12000);
        Developer[] devArr ={developer1,developer2,developer3};

        ScrumTeam scrumTeam1= new ScrumTeam("Alec","ASya","Ömer");
        scrumTeam1.addTesters(testerArr);
        scrumTeam1.addDevelopers(devArr);
        System.out.println(scrumTeam1);
        System.out.println(tester1);

    }
}
