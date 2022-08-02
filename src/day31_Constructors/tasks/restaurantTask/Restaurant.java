package day31_Constructors.tasks.restaurantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
   public String owner,location;
   public int numberOfStars;
    public ArrayList<Server> serverList;
    public ArrayList<Chef> chefList;

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
        serverList = new ArrayList<>();
        chefList = new ArrayList<>();
    }

    public void hireServer(Server server){
        serverList.add(server);
    }
    public void hireServer(Server[] serversArr){
        serverList.addAll(Arrays.asList(serversArr));
    }

    public void hireChef(Chef chef){
        chefList.add(chef);
    }
    public void hireChef(Chef[] chefsArr){
        chefList.addAll(Arrays.asList(chefsArr));
    }

    public void terminateChef(int employeeID){
        chefList.removeIf(p->p.employeeID==employeeID);
    }

    public void terminateServer (int employeeID){
        serverList.removeIf(p->p.employeeID==employeeID);
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                " ,number of chefs=" + chefList.size() +
                " ,number of server=" + serverList.size() +
                '}';
    }
}
