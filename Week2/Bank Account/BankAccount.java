import java.util.Random;

public class BankAccount {

    /*
    We are going to create a BankAccount class. 

    This class will recreate some of the common account transactions that normally occur for a bank account such as displaying:
    - your account number, 
    - checking and savings amount, 
    - total amount. 
    
    Of course, there are also methods to invoke, such as 
    - depositing a check, 
    - checking your balance, 
    - withdrawing money.
    */
    
    
    // The class should have the following attributes: (double) checking balance, (double) savings balance.

    private double checkingBalance;
    private double savingsBalance;
    
     // NINJA BONUS: Add the the following class attribute: account number. The type is up to you, can be a String or a Long or another type.
    private int accountNumber;
    
    
    // Create a class member (static) that has the number of accounts created thus far.
    public static int numberOfAccounts = 0;

    //Create a class member (static) that tracks the total amount of money stored in every account created.
    public static double totalMoneyStored = 0;

    // In the constructor, be sure to increment the account count.
    public BankAccount() {
        BankAccount.numberOfAccounts++;
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        this.accountNumber = BankAccount.generateAccountNumber(); // scroll down to see method
    };

    // Create a getter method for the user's checking account balance.

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    // Create a getter method for the user's saving account balance.

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    // Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.

    public void depositMoney(double checkingDeposit, double savingsDeposit) {
        this.checkingBalance += checkingDeposit;
        this.savingsBalance += savingsDeposit;
        BankAccount.totalMoneyStored += (checkingDeposit + savingsDeposit);
    }

    // Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.

    public void withdrawMoney(double checkingWithdrawal, double savingsWithdrawal) {
        
        boolean sufficientFundsInChecking = false;
        boolean sufficientFundsInSavings = false;

        if(this.checkingBalance >= checkingWithdrawal) {
            this.checkingBalance -= checkingWithdrawal;
            sufficientFundsInChecking = true;

        }
        if(this.savingsBalance >= savingsWithdrawal) {
            this.savingsBalance -= savingsWithdrawal;
            sufficientFundsInSavings = true;
        }
        if(sufficientFundsInChecking) {
            BankAccount.totalMoneyStored -= checkingWithdrawal;
        }
        else {
            BankAccount.displayNSF("checking");
        }

        if(sufficientFundsInSavings) {
            BankAccount.totalMoneyStored -= savingsWithdrawal;
        }
        else {
            BankAccount.displayNSF("savings");
        }
        
    }

    private static void displayNSF(String accountType){
        System.out.println();
        System.out.println("%%%%%%%%%  WARNING %%%%%%%%");
        System.out.printf("You have insufficient funds in your %s account.\n", accountType);
    }


    // Create a method to see the total money from the checking and saving.

    public void displayTotalBalance(){
        System.out.printf("\n========== Your Accounts Balances ==========\n");;
        System.out.printf("Account No       :  %s\n", this.accountNumber);
        System.out.printf("Checking Account :  $%.2f\n", this.checkingBalance);
        System.out.printf("Savings Account  :  $%.2f\n", this.savingsBalance);
    }

    // NINJA BONUS: Create a private method that returns a random ten digit account number.

    private static int generateAccountNumber() {
        Random rd = new Random();
        int randomAccountNumber = rd.nextInt(1000000000) + 1000000001;
        return randomAccountNumber;
    }



}
