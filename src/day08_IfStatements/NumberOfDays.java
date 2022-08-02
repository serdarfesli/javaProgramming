package day08_IfStatements;

public class NumberOfDays {
    public static void main(String[] args) {
        int numberOfMonths = 1;
        if (numberOfMonths == 1 || numberOfMonths == 3 || numberOfMonths == 5 || numberOfMonths == 7 || numberOfMonths == 8 || numberOfMonths == 10 || numberOfMonths == 12) {
            System.out.println("This Months has 31 days");
        }
        if (numberOfMonths == 4 || numberOfMonths == 6 || numberOfMonths == 9 || numberOfMonths == 11) {
            System.out.println("This Months has 30 days");
        }

    }
}
