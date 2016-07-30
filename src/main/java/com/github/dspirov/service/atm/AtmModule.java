package com.github.dspirov.service.atm;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

import javax.inject.Scope;

/**
 * Created by dspirov on 30/07/16.
 */
public class AtmModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(AtmService.class).to(SimpleAtmService.class).in(Scopes.SINGLETON);
    }

}
