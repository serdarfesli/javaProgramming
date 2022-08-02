package day31_Constructors.tasks;

public class Address {
    public int buildingNumber;
    public String street, city, state, zipCode;

    public Address(int buildingNumber, String street, String city, String state, String zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;

    }

    public String toString() {
        return "Address{ " +
                buildingNumber + " " +
                street + " " + city + " "+
                state + ", " + zipCode +
                '}';
    }

}
