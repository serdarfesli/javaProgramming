package day36_Inheritance.tasks.sport;

public class Sport {
    public String name;
    public int numberOfPlayers, numberOfRefree;
    public String rules;

    public void setInfo(String name, int numberOfPlayers, int numberOfRefree, String rules) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfRefree = numberOfRefree;
        this.rules = rules;
    }

public void play(){
    System.out.println("Players are playing" + name);
}

    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfRefree=" + numberOfRefree +
                ", rules='" + rules + '\'' +
                '}';
    }
}
