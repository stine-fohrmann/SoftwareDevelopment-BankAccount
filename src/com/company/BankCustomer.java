package com.company;

import java.util.ArrayList;

public class BankCustomer {
    ArrayList<BankAccount> accounts = new ArrayList();

    public double getTotal()
    {
        double sum = 0;

        for (BankAccount account: accounts)
        {
            sum += account.balance;
        }

        return sum;
    }

    public void addInterests()
    {
        for (BankAccount account: accounts)
        {
            if (account instanceof SavingAccount)
            {
                ((SavingAccount) account).addInterest();
            }
        }

    }


}
