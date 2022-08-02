package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class BankAccountObjects {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setInfo("Ahmet", 12345, 3000);

        BankAccount account2 = new BankAccount();
        account2.setInfo("Ali", 32145, 4000);

        BankAccount account3 = new BankAccount();
        account3.setInfo("Jane", 53421, 2000);

        BankAccount account4 = new BankAccount();
        account4.setInfo("Jennifer", 54421, 6000);

        BankAccount account5 = new BankAccount();
        account5.setInfo("David", 53431, 8000);

        ArrayList<BankAccount> accountList = new ArrayList<>(Arrays.asList(account1, account2, account3, account4, account5));
        System.out.println("accountList = " + accountList);
        account5.checkBalance();
        account5.withdraw(150);
        account5.checkBalance();
    }
}
