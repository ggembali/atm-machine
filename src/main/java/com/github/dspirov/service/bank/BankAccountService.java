package com.github.dspirov.service.bank;

import com.github.dspirov.model.atm.Atm;

/**
 * Bank service responsible for the user accounts. Dispense of money and all transactions are operated by this service.
 *
 * Created by dspirov on 30/07/16.
 */
public interface BankAccountService {

    void withDrawMoney(BankAuthenticationToken token, String atmId, Card card, int amount) throws InvalidTokenException;

}
