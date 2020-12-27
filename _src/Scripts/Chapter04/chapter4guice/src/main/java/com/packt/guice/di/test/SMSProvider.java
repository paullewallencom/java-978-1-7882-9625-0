package com.packt.guice.di.test;

import com.google.inject.Provider;

public class SMSProvider implements Provider<Object>{

    @Override
    public ServiceConnection get() {

        // Write some custom logic here.
        ServiceConnection serviceConnection = new ServiceConnection();
        // Write some custom logic here.
        return serviceConnection;
    }
}