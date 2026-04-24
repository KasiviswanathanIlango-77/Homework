
package com.mycompany.calculator;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {

    private BankAccountSystem account;

    @BeforeEach
    void setUp() {
        account = new BankAccountSystem(1000);
    }

    @Test
    void testDeposit() {
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }

    @Test
    void testDepositNegativeAmount() {
        account.deposit(-100);
        assertEquals(1000, account.getBalance());
    }

    @Test
    void testWithdraw() {
        account.withdraw(300);
        assertEquals(700, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientBalance() {
        account.withdraw(2000);
        assertEquals(1000, account.getBalance());
    }

    @Test
    void testWithdrawNegativeAmount() {
        account.withdraw(-200);
        assertEquals(1000, account.getBalance());
    }

    @Test
    void testCheckBalance() {
        assertEquals(1000, account.getBalance());
    }
}
