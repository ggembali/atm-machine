package com.github.dspirov.service.atm;

import com.github.dspirov.model.atm.Atm;
import com.github.dspirov.model.atm.MoneyBank;
import com.github.dspirov.service.bank.AuthenticationException;
import com.github.dspirov.service.bank.BankAccountService;
import com.github.dspirov.service.bank.BankAuthenticationService;
import com.github.dspirov.service.bank.BankAuthenticationToken;
import com.github.dspirov.service.bank.Card;
import com.github.dspirov.service.bank.InvalidTokenException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of AtmService.
 *
 * Created by dspirov on 30/07/16.
 */
class SimpleAtmService implements AtmService {

    private final static Logger LOG = LoggerFactory.getLogger(SimpleAtmService.class);

    private Map<String, Atm> atms;
    private Map<Card, BankAuthenticationToken> tokens;

    @Inject
    private BankAuthenticationService bankAuthenticationService;

    @Inject
    private BankAccountService bankAccountService;

    SimpleAtmService() {
        this.atms = new HashMap<String, Atm>();
        this.tokens = new HashMap<Card, BankAuthenticationToken>();
    }

    public Atm getAtm(String atmId) {
        return atms.get(atmId);
    }

    public void authenticate(Card card, int pinCode) throws AuthenticationException {
        BankAuthenticationToken token = bankAuthenticationService.authorize(card, pinCode);
        tokens.put(card, token);
    }

    public MoneyBank widthDrawMoney(Atm atm, Card card, int amount) throws PaymentNotPossibleException, CardSessionException {
        if(atm.isWithdrawPossible(amount)) {
            BankAuthenticationToken token = tokens.get(card);
            if(token == null) {
                throw new CardSessionException();
            } else {
                try {
                    bankAccountService.withDrawMoney(token, atm.getId(), card, amount);
                } catch (InvalidTokenException e) {
                    LOG.error("Error while withdraw request", e);
                   throw new CardSessionException();
                }
            }
            return null;
        } else {
            throw new PaymentNotPossibleException();
        }
    }

    public void logout(Card card) {
        tokens.remove(card);
    }
}
