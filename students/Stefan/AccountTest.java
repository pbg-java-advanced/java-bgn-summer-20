package accounts;

import java.util.Scanner;

public class AccountTest {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Account accountIvan = new Account(enterAccountNumber(),enterAccountHolderName(), enterAmount());
        displayAccountInformation(accountIvan);
        withdrawMoney(accountIvan);


    }

    public static int enterAccountNumber() {
        System.out.print("Please enter the account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();
        return accountNumber;
    }
    public static String enterAccountHolderName() {
        System.out.print("please enter the account holder name: ");
        String accountName = scanner.nextLine();
        return accountName;
    }
    public static double enterAmount() {
        System.out.print("Please enter the account balance: ");
        double accountBalance = scanner.nextDouble();
        scanner.nextLine();
        return accountBalance;
    }
    public static void displayAccountInformation (Account accountName) {
        System.out.println("The account details are: \n Account number: " + accountName.getAccountNumber() + "\n Account Name: "
                + accountName.getAccountOwner() + "\n Account balance is: " + accountName.getAccountAmount() + " BGN");
    }
    public static void  withdrawMoney(Account accountName) {
        System.out.println("Please enter the amount to withdraw: ");
        double amountToWithdraw = scanner.nextDouble();
        System.out.println("The current balance of your account is: " + accountName.debit(amountToWithdraw) + " BGN");
    }


}
