package bank;

import log.Log;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Log.createFile();
        Log.write(Log.Level.INFO, "hej verden");
        Log.write(Log.Level.ERROR, "Hello world");
        Log.write(Log.Level.INFO, "hej verden");
        Log.write(Log.Level.INFO, "hej verden");
        Log.write(Log.Level.WARNING, "hej verden");


        // create and trying out the accounts

        BankAccount bankAccount = new BankAccount(123, "trump", 123452);

        SavingAccount savingAccount = new SavingAccount("Trump", 101, 1000000, 0.02);
        savingAccount.addInterest();
        System.out.println("the balance is: " + savingAccount.getBalance() + (" including interests"));

        CheckingAccount checkingAccount = new CheckingAccount("Trump", 102, 100, savingAccount);
        checkingAccount.makeCheck(1000);

        System.out.println("The savings balance is: $" + savingAccount.getBalance());
        System.out.println("The checking balance is $" + checkingAccount.getBalance());

        BankCustomer trump = new BankCustomer();
        trump.accounts.add(bankAccount);
        trump.accounts.add(savingAccount);
        trump.accounts.add(checkingAccount);

        trump.addInterests();


        System.out.println("Trumps total: " + trump.getTotal());



    }
}
