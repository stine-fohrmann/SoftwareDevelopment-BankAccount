package com.company;

public class SavingAccount extends BankAccount {

    double interestRate;

    public SavingAccount(String owner, Integer accountID, double amount, double rate)
    {
        super(amount, owner, accountID);
        this.interestRate = rate;
    }

    public void  addInterest()
    {
        balance += balance*interestRate;
    }

}
