package com.company;

public class CheckingAccount extends BankAccount {
    SavingAccount overdraftaccount;

    public CheckingAccount(String owner , Integer accountID, double amount, SavingAccount od)
    {
        super(amount, owner , accountID);
        this.overdraftaccount = od;
    }

    public boolean makeCheck(double amount)
    {
        boolean result = false;

        if (super.withdrawal(amount))
        {
            System.out.println("ok");
            result = true;

        }
        else if(overdraftaccount.withdrawal(amount-balance ))
        {
            System.out.println("what?!");

            balance = 0.0;
             result = true;
        }
        return result;

    }
}
