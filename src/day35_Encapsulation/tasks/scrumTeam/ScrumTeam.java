package day35_Encapsulation.tasks.scrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    private String PO, BA, SM;
    private ArrayList<Tester> testersList = new ArrayList<>();
    private ArrayList<Developer> devopsList = new ArrayList<>();
    private int daysOfSprint;

    public String getPO() {
        return PO;
    }
    public String getBA() {
        return BA;
    }
    public String getSM() {
        return SM;
    }
    public ArrayList<Tester> getTestersList() {
        return testersList;
    }
    public ArrayList<Developer> getDevopsList() {
        return devopsList;
    }
    public int getDaysOfSprint() {
        return daysOfSprint;
    }


    public void setPO(String PO) {
        this.PO = PO;
    }
    public void setBA(String BA) {
        this.BA = BA;
    }
    public void setSM(String SM) {
        this.SM = SM;
    }
    public void setTestersList(ArrayList<Tester> testersList) {
        this.testersList = testersList;
    }
    public void setDevopsList(ArrayList<Developer> devopsList) {
        this.devopsList = devopsList;
    }
    public void setDaysOfSprint(int daysOfSprint) {
        this.daysOfSprint = daysOfSprint;
    }

    public ScrumTeam(String PO, String BA, String SM) {
        setPO(PO);
        setBA(BA);
        setSM(SM);
    }//constructor

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
        testersList.removeIf(p->p.getEmployeeID()==employeeID);
    }
    public void removeDeveloper(long employeeID){
        devopsList.removeIf(p->p.getEmployeeID()==employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", number Of Devops'" + devopsList.size() + '\'' +
                ", number of testers='" + testersList.size() + '\'' +
                '}';
    } //toString    number of tester and devops are added
}
