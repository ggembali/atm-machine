package com.github.dspirov.service.atm;

import com.github.dspirov.model.atm.Atm;
import com.github.dspirov.model.atm.MoneyBank;
import com.github.dspirov.service.bank.AuthenticationException;
import com.github.dspirov.service.bank.Card;

/**
 * Service that operates the ATM. It is assumed that one ATM is always one instance and all operations are not accessed
 * from multiple threads.
 *
 * Created by dspirov on 30/07/16.
 */
public interface AtmService {

    /**
     * Authenticates the given card in the system.
     *
     * @param card card to be authenticated
     * @param pinCode pin-code for the card
     */
    void authenticate(Card card, int pinCode) throws AuthenticationException;

    /**
     * Returns bank containing banknotes/ coins which are to be payed to the customer.
     *
     * @param atm atm from which to withdraw
     * @param card card for the transaction
     * @param amount amount to be withdrawn
     * @return bank with the coins/ banknotes to be payed
     * @throws PaymentNotPossibleException if payment is not possible at the moment
     */
    MoneyBank widthDrawMoney(Atm atm,Card card, int amount) throws PaymentNotPossibleException, CardSessionException;

    /**
     * Clears all state in the application about the current card.
     *
     * @param card card to be logged out
     */
    void logout(Card card);

}
