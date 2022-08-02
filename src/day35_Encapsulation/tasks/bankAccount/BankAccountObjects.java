package day35_Encapsulation.tasks.bankAccount;

public class BankAccountObjects {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Serdar",12345,100);
        bankAccount1.deposit(25);
        bankAccount1.checkBalance();
        bankAccount1.withdraw(35);
        bankAccount1.checkBalance();
        System.out.println(bankAccount1);

    }
}
