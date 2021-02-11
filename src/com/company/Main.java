package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // create and trying out the accounts
        SavingAccount savingAccount = new SavingAccount("Trump", 101, 1000000, 0.02);
        savingAccount.addInterest();
        System.out.println("the balance is: " + savingAccount.getBalance() + (" including interests"));

        CheckingAccount checkingAccount = new CheckingAccount("Trump", 102, 100, savingAccount);
        checkingAccount.makeCheck(1000);

        System.out.println("The savings balance is: $" + savingAccount.getBalance());
        System.out.println("The checking balance is $" + checkingAccount.getBalance());
    }
}
