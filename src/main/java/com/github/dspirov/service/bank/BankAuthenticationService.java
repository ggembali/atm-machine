package com.github.dspirov.service.bank;

/**
 * Authentication service for the cards.
 *
 * Created by dspirov on 30/07/16.
 */
public interface BankAuthenticationService {

    /**
     * Authorize credit card with the data specified by the parameters.
     *
     * @param card card to be authorized
     * @param pinCode pin-code for the card
     * @return BankAuthenticationToken if authorized. This token needs to be used in all further communication to the bank
     *  system
     * @throws AuthenticationException in case system cannot perform the operation because of other reasons
     */
    BankAuthenticationToken authorize(Card card, int pinCode) throws AuthenticationException;

}
