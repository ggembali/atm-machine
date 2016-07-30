package com.github.dspirov.model.atm;

/**
 * Base class for paying out the users - cash.
 *
 * Created by dspirov on 30/07/16.
 */
abstract class Money {

    private String description;
    private int value;
    private MoneyType type;

    public Money(String description, int value, MoneyType type) {
        this.description = description;
        this.value = value;
        this.type = type;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;

        if (value != money.value) return false;
        return type == money.type;

    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
