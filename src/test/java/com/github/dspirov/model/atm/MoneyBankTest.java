package com.github.dspirov.model.atm;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by dspirov on 30/07/16.
 */
public class MoneyBankTest {

    private MoneyBank moneyBank;

    @BeforeMethod
    public void setUp() throws Exception {
        moneyBank = new MoneyBank();
        MoneyWallet mw1 = new MoneyWallet(new OneDollar());
        mw1.setAmount(45);
        moneyBank.addWallet(mw1);
    }

    @Test
    public void testGetWallet() throws Exception {
        MoneyWallet wallet = moneyBank.getWallet(new OneDollar());
        Assert.assertNotNull(wallet);
    }

    @Test
    public void testGetTotalAmount() throws Exception {
        MoneyWallet wallet = moneyBank.getWallet(new OneDollar());
        Assert.assertEquals(wallet.getTotalValue(), 45);
    }
}