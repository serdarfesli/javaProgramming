package day31_Constructors;

public class Pizza {
    public char size;
    public  int numberOfCheeseTopping,numberOfPepperoniTopping;


    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public int calcCost(){
        int totalCost=0;
     if (!(size == 'S' || size == 'M' || size == 'L')) {
            System.err.println("Please enter a valid size");
            return -1;
     }

        if (size=='S'){
             totalCost=10+2*numberOfCheeseTopping+2*numberOfPepperoniTopping;
        } else if (size=='M') {
            totalCost=12+2*numberOfCheeseTopping+2*numberOfPepperoniTopping;
        } else {
            totalCost=14+2*numberOfCheeseTopping+2*numberOfPepperoniTopping;
        }
        return totalCost;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping + ", totalCost=" + calcCost() +
        '}';
    }
}
