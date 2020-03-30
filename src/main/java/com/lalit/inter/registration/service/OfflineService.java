package com.lalit.inter.registration.service;

import org.springframework.stereotype.Component;

@Component
public class OfflineService implements ServiceIdentifier{
    @Override
    public void getService() {
        System.out.println("Offline Service");
    }

    @Override
    public boolean serviceType(String serviceType) {
        if(serviceType.equals("Offline")){
            return true;
        }
        return false;
    }
}
