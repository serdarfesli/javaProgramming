package day35_Encapsulation.tasks.bankAccount;

public class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }

    
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }//constructor
    
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        balance-=amount;
    }
    public void checkBalance(){
        System.out.println("balance = " + balance);
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
