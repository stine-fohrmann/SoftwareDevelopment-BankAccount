package com.company;

public class SavingAccount extends BankAccount implements Account{

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

    @Override
    public void addInterests() {
        addInterest();
        // to get backward compability with Line's code
    }
}
