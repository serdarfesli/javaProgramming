package day09_IfElse;

public class CampusTime {
    public static void main(String[] args) {
        int time =10;
        String message;
        if(time >= 8 && time <= 23){
            message="open";
        }else {
            message="closed";
        }
        System.out.println(message);
    }
}
