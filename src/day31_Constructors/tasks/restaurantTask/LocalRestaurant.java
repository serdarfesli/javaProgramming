package day31_Constructors.tasks.restaurantTask;

public class LocalRestaurant {
    public static void main(String[] args) {
        
        Restaurant restaurant1 = new Restaurant("Mehmet","İstanbul",5);
        Restaurant restaurant2 = new Restaurant("Hasan Usta","Adana",5);
        Restaurant restaurant3 = new Restaurant("Ciğerci Ali","Urfa",4);
        Restaurant restaurant4 = new Restaurant("Lütfü Usta","Urfa",3);
        Restaurant restaurant5 = new Restaurant("Mıçi Usta","Ankara",3);
        
        Server server1 = new Server("Cihan",100,20,true);
        Server server2 = new Server("Asude",101,20,false);
        Server server3 = new Server("Serdar",102,30,true);
        Server[] serverArr ={server1,server2,server3};

        Chef chef1 = new Chef("Hamdi",103,40,true);
        Chef chef2 = new Chef("Seda",104,40,false);
        Chef chef3 = new Chef("Murat",105,60,true);
        Chef[] chefArr ={chef1,chef2,chef3};
        
        restaurant1.hireServer(serverArr);
        restaurant1.hireChef(chefArr);

        System.out.println(restaurant1);
        System.out.println(chef2);
    }
}
