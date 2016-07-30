package com.github.dspirov.model.atm;

/**
 * Created by dspirov on 30/07/16.
 */
public class Money {

    private String description;
    private int value;
    private MoneyType type;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public MoneyType getType() {
        return type;
    }

    public void setType(MoneyType type) {
        this.type = type;
    }
}
