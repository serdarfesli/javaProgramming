package day35_Encapsulation.tasks.candiesTask;

public class Candy {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public String getBrand() {
        return brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            System.err.println("Invalid Quantity");
            return;
        }
        this.quantity = quantity;
    } //cond. added

    public void setPrice(double price) {
        if (price < 0) {
            System.err.println("Invalid Price");
            System.exit(1);
        }
        this.price = price;
    } //cond added

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    } //constructor


    public String toString() {
        if (price == 0) {
            return "Candy{" +
                    "brand='" + getBrand() + '\'' +
                    ", quantity=" + getQuantity() +
                    ", price= free" +
                    ", hasPeanuts=" + isHasPeanuts() +
                    '}';
        } else {
            return "Candy{" +
                    "brand='" + getBrand() + '\'' +
                    ", quantity=" + getQuantity() +
                    ", price=" + getPrice() +
                    ", hasPeanuts=" + isHasPeanuts() +
                    '}';
        }
    }
}
