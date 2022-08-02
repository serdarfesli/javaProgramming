package day31_Constructors.tasks.restaurantTask;

public class Server {
    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void takeOrder() {
        System.out.println(name + " is taking order");
    }

    public void cleanTable() {
        System.out.println(name + " is cleaning the table");
    }

    public String toString() {
        if (fullTime == true) {
            return "Server{" +
                    "name='" + name + '\'' +
                    ", employeeID=" + employeeID +
                    ", hourlyRate=" + hourlyRate +
                    ", full-time" +
                    '}';
        } else {
            return "Server{" +
                    "name='" + name + '\'' +
                    ", employeeID=" + employeeID +
                    ", hourlyRate=" + hourlyRate +
                    ", part-time" +
                    '}';
        }
    }






}
