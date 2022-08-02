package day35_Encapsulation.tasks.person;

public class Person {
    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman,hasNose;
    public static int numberOfWings,numberOfHead;


    static {
        planet="World";
        isHuman=true;
        hasNose=true;
        numberOfWings=0;
        numberOfHead=1;
    }//static blocks

    public Person(String name, int age,char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender=gender;
        this.language = language;
    } //constructor

    public static void printPlanetName(){
        System.out.println("planet = " + planet);
    }

    public void eat(String food){
        System.out.println(name + " is eating"+ food);
    } //eat method
    public void drink(String drink){
        System.out.println(name + " is drinking"+ drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                " ,planet='" + planet + '\'' +
                '}';
    }
}
