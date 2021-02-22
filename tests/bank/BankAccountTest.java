package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount bankAccount;

    @BeforeEach     // a new bank account is created before each test?
    void setUp() {
        bankAccount = new BankAccount(500, "owner", 1);
    }

    @Test
    void withdrawal() {
        bankAccount.withdrawal(250);
        assertEquals(bankAccount.balance, 250);
    }

    @Test
    void getBalanceTest(){
        assertEquals(bankAccount.getBalance(), 500);
    }
}