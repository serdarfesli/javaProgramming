package day35_Encapsulation.tasks.item;

public class Item {
    private String name;
    private double unitPrice;
    private int quantity;

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }


    public void setName(String name) {
        if (name.isEmpty() || name.isBlank() || (name==null))  {
            System.err.println("Name cannot be empty or blank");
            System.exit(1);
        }

        boolean isletterOrDigitOrSpace = false;
        char[] arr = name.toCharArray();
        for (char c : arr) {
            isletterOrDigitOrSpace = (Character.isLetterOrDigit(c) || c == ' ');
        }

        boolean startsWithLetter = false;
        startsWithLetter = Character.isLetter(name.charAt(0));

        if ( startsWithLetter == false || isletterOrDigitOrSpace == false) {
            System.err.println("Invalid Name");
            System.exit(1);
        }
        this.name = name;
    } //cond. added

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            System.err.println("Invalid unitPrice");
            return;
        }
        this.unitPrice = unitPrice;
    } //cond. added

    public void setQuantity(int quantity) {
        //
        if (quantity < 0) {
            System.err.println("Invalid quantity");
            return;
        }
        if (!name.isEmpty() || !name.isBlank() || !(name==null)) {
            if (name.equalsIgnoreCase("toilet paper") && quantity > 1) {
                System.err.println("toilet paper cannot be more than 1");
                return;
            }
        }
        this.quantity = quantity;
    }

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    } //constr. added with setters

    public double calcCost() {
        return unitPrice * quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalCost=" + calcCost() +
                '}';
    }

}
