package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CheckingAccountTest {

    @Mock
    SavingAccount savingAccountMock;

    CheckingAccount checkingAccount;

    @BeforeEach
    void setUp() {
        checkingAccount = new CheckingAccount("owner", 101, 1000, savingAccountMock);
    }

    @Test
    void makeValidCheck() {
        when(savingAccountMock.withdrawal(50)).thenReturn(true);
        assertEquals(checkingAccount.makeCheck(1050), true);
    }

    @Test
    void makeinValidCheck() {
        when(savingAccountMock.withdrawal(55)).thenReturn(false);
        assertEquals(checkingAccount.makeCheck(1055), false);
    }
}