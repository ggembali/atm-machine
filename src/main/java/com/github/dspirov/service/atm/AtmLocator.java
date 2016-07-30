package com.github.dspirov.service.atm;

import com.github.dspirov.model.atm.Atm;

/**
 * Created by dspirov on 30/07/16.
 */
public interface AtmLocator {

    /**
     * Locates the specified ATM object.
     *
     * @param atmId id of the ATM.
     * @return requested ATM
     */
    Atm getAtm(String atmId);

}
