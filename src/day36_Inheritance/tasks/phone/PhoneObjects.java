package day36_Inheritance.tasks.phone;

public class PhoneObjects {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone();
        Samsung samsung1= new Samsung();
        Nokia nokia1 = new Nokia();
        iphone1.setInfo("iphone","7","small","white",10000);
        samsung1.setInfo("samsung","galaxy 20","large","black",7000);
        nokia1.setInfo("nokia","dlaksdş","medium","black",2000);

        iphone1.call(12345);
        samsung1.text(45646);
        nokia1.selfDefence();
        samsung1.freeze();
    }
}
