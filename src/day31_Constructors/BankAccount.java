package day31_Constructors;

public class BankAccount {
    public String accountHolder;
    public int accountNumber;
    public double balance;

    public void setInfo(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("balance = " + balance);
    }
    public void deposit(double givenAmount){
        balance+= givenAmount;
    }
    public void withdraw(double givenAmount){
        balance-=givenAmount;
    }

}
