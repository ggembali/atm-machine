package com.github.dspirov.service.bank;

import java.util.Date;

/**
 * Created by dspirov on 30/07/16.
 */
public class Card {

    private String number;
    private Date validFromDate;
    private Date validUntilDate;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getValidFromDate() {
        return validFromDate;
    }

    public void setValidFromDate(Date validFromDate) {
        this.validFromDate = validFromDate;
    }

    public Date getValidUntilDate() {
        return validUntilDate;
    }

    public void setValidUntilDate(Date validUntilDate) {
        this.validUntilDate = validUntilDate;
    }
}
