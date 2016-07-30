package com.github.dspirov.model.atm;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dspirov on 30/07/16.
 */
public class MoneyBank {

    private Map<Money, MoneyWallet> wallets;

    public MoneyBank() {
        this.wallets = new HashMap<Money, MoneyWallet>();
    }

    public MoneyWallet getWallet(Money money) {
        return wallets.get(money);
    }

}
