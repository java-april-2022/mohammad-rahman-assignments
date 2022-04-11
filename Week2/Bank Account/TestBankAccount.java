public class TestBankAccount {
    
    public static void main(String[] args) {
        
        BankAccount account1 = new BankAccount();
        System.out.printf("\nNew Account Opened: #%s", account1.getAccountNumber());

        account1.displayTotalBalance();
        account1.depositMoney(3087.50, 25000);
        account1.displayTotalBalance();

        System.out.printf("\nTotal Bank Balance: $%.2f\n",BankAccount.totalMoneyStored);
        
        BankAccount account2 = new BankAccount();
        System.out.printf("\nNew Account Opened: #%s\n", account2.getAccountNumber());

        account2.displayTotalBalance();
        account2.depositMoney(550, 4000);
        account2.displayTotalBalance();

        System.out.printf("\nTotal Bank Balance: $%.2f\n",BankAccount.totalMoneyStored);
        
        account1.withdrawMoney(400, 0);
        account1.displayTotalBalance();
        account1.withdrawMoney(10, 1000);
        account1.displayTotalBalance();

        System.out.printf("\nTotal Bank Balance: $%.2f\n",BankAccount.totalMoneyStored);
        
        account2.withdrawMoney(0, 100000);
        account2.displayTotalBalance();

        System.out.printf("\nTotal Bank Balance: $%.2f\n",BankAccount.totalMoneyStored);

        System.out.printf("\nTotal Bank Balance: $%.2f\n",BankAccount.totalMoneyStored);
        
        account2.withdrawMoney(20, 1000);
        account2.displayTotalBalance();

        System.out.printf("\nTotal Bank Balance: $%.2f\n",BankAccount.totalMoneyStored);

    }
}
