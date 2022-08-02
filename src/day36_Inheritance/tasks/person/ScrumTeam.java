package day36_Inheritance.tasks.person;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public ProductOwner productOwner;
    public BusinessAnalyst businessAnalyst;
    public ScrumMaster scrumMaster;
    public ArrayList<Tester> testersList;
    public ArrayList<Developer> developersList;



    public void addTester(Tester tester){
        testersList.add(tester);
    }
   public void addTesters(Tester[] testers){
        testersList.addAll(Arrays.asList(testers));
   }

    public void removeTester(int id){
        testersList.removeIf(p->p.id==id);
    }




    public void addDeveloper(Developer developer){
        developersList.add(developer);
    }
    public void addDevelopers(Developer[] developers){
        developersList.addAll(Arrays.asList(developers));
    }
    public void removeDeveloper(int id){
        developersList.removeIf(p->p.id==id);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO=" + productOwner.name +
                ", BA=" + businessAnalyst.name +
                ", SM=" + scrumMaster.name +
                ", testersList=" + testersList.size() +
                ", developersList=" + developersList.size() +
                '}';
    }
}
