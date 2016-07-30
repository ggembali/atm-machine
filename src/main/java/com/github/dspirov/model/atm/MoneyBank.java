package com.github.dspirov.model.atm;

import java.util.HashMap;
import java.util.Map;

/**
 * Keeps track of available cash in the ATM.
 *
 * Created by dspirov on 30/07/16.
 */
public class MoneyBank {

    private Map<Money, MoneyWallet> wallets;

    public MoneyBank() {
        this.wallets = new HashMap<Money, MoneyWallet>();
    }

    public void addWallet(MoneyWallet moneyWallet) {
        this.wallets.put(moneyWallet.getMoney(), moneyWallet);
    }

    public MoneyWallet getWallet(Money money) {
        return wallets.get(money);
    }

    public int getTotalAmount() {
        int sum = 0;
        for(Map.Entry<Money, MoneyWallet> entry: wallets.entrySet()) {
            MoneyWallet wallet = entry.getValue();
            sum += wallet.getTotalValue();
        }
        return sum;
    }

}
