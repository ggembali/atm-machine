package com.github.dspirov.model.atm;

/**
 * Created by dspirov on 30/07/16.
 */
public class MoneyWallet {

    private final Money money;
    private int amount;

    public MoneyWallet(Money money) {
        this.money = money;
    }

    public Money getMoney() {
        return money;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getTotalValue() {
        return money.getValue() * amount;
    }
}
