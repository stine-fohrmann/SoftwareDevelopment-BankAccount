package com.company;

import com.company.Account;
import com.company.BankAccount;

import java.util.ArrayList;

public class FancyBankCustomer {
    ArrayList<Account> accounts = new ArrayList<Account>();

    public double getTotal()
    {
        double sum = 0;

        for (Account account: accounts)
        {
            sum += account.getBalance();
        }

        return sum;
    }

    public void addInterests()
    {
        for (Account account: accounts)
        {
            account.addInterests();
        }

    }
}
