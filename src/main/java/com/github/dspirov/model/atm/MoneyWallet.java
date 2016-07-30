package com.github.dspirov.model.atm;

/**
 * Created by dspirov on 30/07/16.
 */
public class MoneyWallet {

    private Money money;
    private int amount;

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
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
