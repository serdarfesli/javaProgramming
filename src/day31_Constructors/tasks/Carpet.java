package day31_Constructors.tasks;

public class Carpet {
    public double width, length, unitPrice;
public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }
    public double calcCost() {
        double totalCost=0;
        if (isPersian){
            totalCost = width*length*unitPrice + 200;
        } else {
            totalCost = width*length*unitPrice;
        }
        return totalCost;

    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalCost=" + calcCost() +
                '}';
    }
}
