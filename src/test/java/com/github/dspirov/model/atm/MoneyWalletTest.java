package com.github.dspirov.model.atm;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by dspirov on 30/07/16.
 */
public class MoneyWalletTest {

    @Test
    public void testGetTotalValue() throws Exception {
        MoneyWallet moneyWallet = new MoneyWallet(new OneDollar());
        moneyWallet.setAmount(45);
        Assert.assertEquals(moneyWallet.getTotalValue(), 45);
    }
}