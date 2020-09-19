package BankAccount;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AccountsConstructionsAndOperations {

    public AccountsConstructionsAndOperations() {

    }


    DecimalFormat df2 = new DecimalFormat("#.##");
    private Scanner scanner = new Scanner(System.in);

    private String name = "";
    private String iban;
    private double balance;
    private String currency;
    private int i = 0;


    public AccountsConstructionsAndOperations(String accountHolder, String ibanNumber, double balance, String currency) {
        this.name = accountHolder;
        this.iban = ibanNumber;
        this.balance = balance;
        this.currency = currency;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIban() {
        return iban;
    }

    public double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }


    public void debit(String accountHolder) {

        AccountsInBank accountsInBank = new AccountsInBank();

        //try to find existing bank account
        for (i = 0; i < accountsInBank.allAccounts.length; i++) {
            if ( (accountsInBank.allAccounts[i].getName()).equals(accountHolder) ) {

                setName(accountsInBank.allAccounts[i].name);
                System.out.println("Account found:");
                System.out.println("Name: " + accountsInBank.allAccounts[i].getName() + " \t Balance: " + accountsInBank.allAccounts[i].getBalance() + " " + accountsInBank.allAccounts[i].getCurrency() + " \tIBAN of Account: " + accountsInBank.allAccounts[i].getIban() );
                break;
            }
        }


        if(this.name.equals("")){
            System.err.println("The account was not found!");
            System.exit(0);
        }

        while(true) {
            System.out.println("How much money to be deposited from this account? ");
            System.out.print("Enter --> ");
            System.out.flush();
            //replace '.' with ','
            String checkTheDouble = scanner.nextLine();
            checkTheDouble.replaceAll(".", ",");
            double moneyToBeDeposited = Double.valueOf(checkTheDouble);

            //check if entered balance is bigger than actual
            if (moneyToBeDeposited > accountsInBank.allAccounts[i].getBalance()) {
                System.err.println("Sorry, but account's balance is too low to deposit " + moneyToBeDeposited);
                System.err.flush();
            } else {
                accountsInBank.allAccounts[i].balance = accountsInBank.allAccounts[i].balance - moneyToBeDeposited;
                break;
            }
        }

        //print new balance
        String format = df2.format(accountsInBank.allAccounts[i].balance);
        System.out.println("Money deposited successfully! \nAccount balance left --> " + format + " " +accountsInBank.allAccounts[i].getCurrency());
        System.exit(0);

    }


}


