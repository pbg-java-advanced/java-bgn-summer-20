package BankAccount;

class AccountsInBank{

    AccountsInBank (){

    }

     AccountsConstructionsAndOperations[] allAccounts = new AccountsConstructionsAndOperations[3];

    {
        allAccounts[0] = new AccountsConstructionsAndOperations("Mike", "BG80 BNBG 9661 1020 3456 78", 2925.30, "BGN");
        allAccounts[1] = new AccountsConstructionsAndOperations("Carl", "BG80 BNBG 9651 1044 3666 98", 129.30, "USD");
        allAccounts[2] = new AccountsConstructionsAndOperations("Paul", "BG80 BNBG 9361 1120 3056 28", 11239.18, "EUR");
    }
}
