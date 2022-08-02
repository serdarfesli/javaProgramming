package day35_Encapsulation.encapsulation;

public class Person {
    private String name;
    private int age;

    public String getName(){
        return name;
    } // getter

    public void setName(String name){
        this.name=name;
    } // setterg

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (age<0){
            System.err.println("Invalid data"+ age);
            System.exit(0);
        }
        this.age= age;
    }

}
