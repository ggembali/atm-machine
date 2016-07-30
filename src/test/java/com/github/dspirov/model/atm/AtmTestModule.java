package com.github.dspirov.model.atm;

import com.github.dspirov.service.atm.AtmLocator;
import com.github.dspirov.service.atm.AtmModule;
import com.github.dspirov.service.bank.BankAccountService;
import com.github.dspirov.service.bank.BankAuthenticationService;
import com.google.inject.AbstractModule;
import com.sun.deploy.config.MacOSXPlatform;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

/**
 * Test guice module ued only for testing the AtmService. Some of the services are mocked only for the purpose of this test.
 *
 * Created by dspirov on 30/07/16.
 */
public class AtmTestModule extends AbstractModule {

    @Override
    protected void configure() {
        install(new AtmModule());
        bind(BankAccountService.class).toInstance(Mockito.mock(BankAccountService.class));
        bind(BankAuthenticationService.class).toInstance(Mockito.mock(BankAuthenticationService.class));
        bind(AtmLocator.class).to(TestAtmLocator.class);
    }

    private static class TestAtmLocator implements AtmLocator {

        public static final String ATM_1 = "atm-1";
        private Map<String, Atm> atms;

        private TestAtmLocator() {
            this.atms = new HashMap<String, Atm>();
            MoneyBank mb = new MoneyBank();
            Atm atm1 = new Atm(mb);
            atm1.setId(ATM_1);
            this.atms.put(ATM_1, atm1);
        }

        public Atm getAtm(String atmId) {
            return atms.get(atmId);
        }
    }

}
