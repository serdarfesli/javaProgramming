package day31_Constructors.tasks.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String PO, BA, SM;
    ArrayList<Tester> testersList = new ArrayList<>();
    ArrayList<Developer> devopsList = new ArrayList<>();
    int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM,int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint=daysOfSprint; 
    }
    public void addTester(Tester tester){
        testersList.add(tester);
    }
    public void addTesters(Tester[] testers){
        testersList.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer){
        devopsList.add(developer);
    }
    public void addDevelopers(Developer[] developers){
        devopsList.addAll(Arrays.asList(developers));
    }

    public void removeTester(long employeeID){
        testersList.removeIf(p->p.employeeId==employeeID);
    }

    public void removeDeveloper(long employeeID){
        devopsList.removeIf(p->p.employeeId==employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "number of testers: "+ testersList.size() +'\'' +
                " number of developers: "+ devopsList.size() +'\'' +
                 " PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                '}';
    }
}
