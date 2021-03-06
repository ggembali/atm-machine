package com.github.dspirov.model.atm;

import com.github.dspirov.service.atm.AtmLocator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import javax.inject.Inject;

/**
 * Test module for the AtmTest.
 *
 * Created by dspirov on 30/07/16.
 */
@Guice(modules = AtmTestModule.class)
public class AtmTest {

    @Inject
    private AtmLocator atmLocator;

    @BeforeMethod
    public void setUp() throws Exception {

    }

    @Test
    public void testName() throws Exception {
        String atmId = "atm-1";
        Atm atm = atmLocator.getAtm(atmId);
        Assert.assertNotNull(atm);
        Assert.assertEquals(atm.getId(), atmId, "Requested atm atm-1 was not found");
    }

    @Test
    public void testIsWithdrawPossible_moreThenMaxAllowed() throws Exception {
        String atmId = "atm-1";
        Atm atm = atmLocator.getAtm(atmId);
        Assert.assertTrue(!atm.isWithdrawPossible(Atm.MAX_ALLOWED_AMOUNT + 1), "Is possible to withdraw more then MAX_ALLOWED");
    }

}