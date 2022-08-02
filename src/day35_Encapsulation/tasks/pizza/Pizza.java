package day35_Encapsulation.tasks.pizza;

public class Pizza {
    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public String getSize() {
        return size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }


    public void setSize(String size) {
        if (!(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium")
                || size.equalsIgnoreCase("large"))) {
            System.err.println("Invalid size name, size can only be small, medium or large");
            System.exit(1);
        }
        this.size = size;
    } //conds. added

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (numberOfCheeseTopping < 0) {
            System.err.println("Invalid number of cheese topping");
            return;
        } else if (size.equalsIgnoreCase("small") && numberOfCheeseTopping > 3) {
            System.err.println("max small size pizza cheese topping is 3");
            this.numberOfCheeseTopping = 3;
        } else if (size.equalsIgnoreCase("medium") && numberOfCheeseTopping > 4) {
            System.err.println("max middle size pizza cheese topping is 4");
            this.numberOfCheeseTopping = 4;
        } else if (size.equalsIgnoreCase("large") && numberOfCheeseTopping > 5) {
            System.err.println("max large size pizza cheese topping is 5");
            this.numberOfCheeseTopping = 5;
        } else {
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        }
    } //conds. added

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if (numberOfPepperoniTopping < 0) {
            System.err.println("Invalid number of pepperoni topping");
            return;
        } else if (size.equalsIgnoreCase("small") && numberOfPepperoniTopping > 4) {
            System.err.println("max small size pizza pepperoni topping is 4");
            this.numberOfPepperoniTopping = 4;
        } else if (size.equalsIgnoreCase("medium") && numberOfPepperoniTopping > 5) {
            System.err.println("max middle size pizza pepperoni topping is 5");
            this.numberOfPepperoniTopping = 5;
        } else if (size.equalsIgnoreCase("large") && numberOfPepperoniTopping > 6) {
            System.err.println("max large size pizza pepperoni topping is 6");
            this.numberOfPepperoniTopping = 6;
        }else {
            this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        }
    } //condt added

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    } //constructor

    public double calcCost() {
        double totalCost = (numberOfCheeseTopping + numberOfPepperoniTopping) * 2;
        if (size.equalsIgnoreCase("small")) {
            totalCost += 10;
        } else if (size.equalsIgnoreCase("medium")) {
            totalCost += 12;
        } else {
            totalCost += 14;
        }
        return totalCost;
    } //calcCost method

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", totalCost=" + calcCost() +
                '}';
    } //toString method
}
