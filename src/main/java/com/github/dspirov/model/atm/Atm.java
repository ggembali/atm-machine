package com.github.dspirov.model.atm;

/**
 * Created by dspirov on 30/07/16.
 */
public class Atm {

    public static final int MAX_ALLOWED_AMOUNT = 10000;

    private String id;
    private MoneyBank moneyBank;

    Atm(MoneyBank moneyBank) {
        this.moneyBank = moneyBank;
    }

    public String getId() {
        return id;
    }

    public boolean isWithdrawPossible(int amount) {
        if(amount > 10000) {
            return false;
        }
        return true;
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
