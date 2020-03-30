package com.lalit.inter.registration.service;

import org.springframework.stereotype.Component;

@Component
public class OnlineService implements ServiceIdentifier {

    @Override
    public void getService() {
        System.out.println("Online Service");
    }

    @Override
    public boolean serviceType(String serviceType) {
        if(serviceType.equals("Online")){
            return true;
        }
        return false;
    }
}
