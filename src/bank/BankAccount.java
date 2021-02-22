package bank;

public class BankAccount implements Account {
    double balance;
    String owner;
    Integer accountID;

    public BankAccount(double balance, String owner, Integer accountID) {
        this.balance = balance;
        this.owner = owner;
        this.accountID = accountID;
    }

    @Override
    public double addInterests() {
        // do nothing - no interests!
        return -1.0;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit (double amount)
    {
        this.balance += amount;
    }

    public boolean withdrawal(double amount)
    {
        boolean result = false;
        if (amount <= balance)
        {
            balance -= amount;
            result = true;
            return result;
        }
        return result;
    }
}
