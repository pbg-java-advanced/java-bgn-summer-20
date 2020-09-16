package accounts;

public class Account {
    private int accountNumber;
    private String accountOwner;
    private double accountAmount;

    public Account() {
    }

    public Account(int accountNumber, String accountOwner, double accountAmount) {
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
        this.accountAmount = accountAmount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public double getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(double accountAmount) {
        this.accountAmount = accountAmount;
    }

    public double debit (double withdrawValue){
        double balance = 0;
        if (withdrawValue > accountAmount) {
            System.out.println("Debit amount exceeded account balance");
        } else {
            balance = accountAmount - withdrawValue;
            return balance;

        } return balance;
    }

}
