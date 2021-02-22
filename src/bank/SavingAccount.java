package bank;

public class SavingAccount extends BankAccount implements Account{

    double interestRate;

    public SavingAccount(String owner, Integer accountID, double amount, double rate)
    {
        super(amount, owner, accountID);
        this.interestRate = rate;
    }

    public double  addInterest()
    {
        balance += balance*interestRate;
        return balance;
    }

    @Override
    public double addInterests() {
        return addInterest();
        // to get backward compability with Line's code
    }
}
