package day31_Constructors.tasks.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {

        Tester[] testers = {new Tester("Serdar", 1234657, "SDET", 110000), new Tester("Cihan", 1236547, "SDET", 70000), new Tester("Mike", 7654321, "SDET", 50000)};
        Developer[] developers = {new Developer("Jane", 1111111, "Devop", 110000), new Developer("Alex", 2222222, "Devop", 170000), new Developer("Tim", 3333333, "Devop", 1150000)};
        ScrumTeam scrumTeam = new ScrumTeam("Steve", "Asya", "Ömer",14);
        scrumTeam.addTesters(testers);
        scrumTeam.addDevelopers(developers);

        System.out.println("scrumTeam = " + scrumTeam);
        scrumTeam.removeDeveloper(1111111);
        System.out.println(scrumTeam.devopsList);


    }
}