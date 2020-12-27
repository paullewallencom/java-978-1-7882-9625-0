package com.packt.guice.di.test;

import javax.inject.Provider;

import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

public class NotificationClientProviderTest {

    public static void main(String args[]){
        Injector injector = Guice.createInjector(
            new Module(){
                @Override
                public void configure(Binder binder) {
                    binder.bind(ServiceConnection.class).toProvider((Class<? extends Provider<? extends ServiceConnection>>) SMSProvider.class);
                }
            }
        );

        ServiceConnection serviceConnection =
        injector.getInstance(ServiceConnection.class);
        serviceConnection.startService();
        serviceConnection.stopService();
    }
}