package BankAccount;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AccountsConstructionsAndOperations account = new AccountsConstructionsAndOperations();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name of existing account holder: ");
        String accountHolder = scanner.nextLine();

        //transform input name
        accountHolder = accountHolder.substring(0,1).toUpperCase() + accountHolder.substring(1).toLowerCase();
        accountHolder = accountHolder.replaceAll("\\s", "");
        account.debit(accountHolder);

    }

}
