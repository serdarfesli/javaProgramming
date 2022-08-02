package day35_Encapsulation.tasks.carpet;

public class Carpet {
    private double width,length,unitPrice;
    private boolean isPersian;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<=0){
            System.err.println("Invalid width");
            return;
        }
        this.width = width;
    }//cond. added

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<=0){
            System.err.println("Invalid length");
            return;
        }
        this.length = length;
    } //cond. added

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice<0){
            System.err.println("Invalid unitPrice");
            return;
        }
        this.unitPrice = unitPrice;
    } //cond added.

    public boolean isPersian() {
        return isPersian;
    }

    public void setPersian(boolean persian) {
        isPersian = persian;
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        setWidth( width);
        setLength( length);
        setUnitPrice( unitPrice);
        setPersian( isPersian);
    } //constr with setters

    public double calcCost(){
        double totalCost= width*length*unitPrice;
        if (isPersian==true){
            totalCost+=200;
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
