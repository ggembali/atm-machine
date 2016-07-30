package com.github.dspirov.model.atm;

/**
 * Created by dspirov on 30/07/16.
 */
public class Atm {

    private String id;
    private MoneyBank moneyBank;

    Atm(MoneyBank moneyBank) {
        this.moneyBank = moneyBank;
    }

    public String getId() {
        return id;
    }

    public boolean isWithdrawPossible(int amount) {
        return false;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MoneyBank getMoneyBank() {
        return moneyBank;
    }

    public void setMoneyBank(MoneyBank moneyBank) {
        this.moneyBank = moneyBank;
    }
}
