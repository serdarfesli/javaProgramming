package day36_Inheritance.tasks.phone;

public class Iphone extends Phone {
    public void faceTime(long phoneNumber){
        System.out.println(phoneNumber + " is calling through facetime");
    }
    public void faceTime(String email){
        System.out.println(email + " is calling through facetime");
    }
}
