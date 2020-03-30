package com.lalit.inter.registration.service;

import com.lalit.inter.registration.factory.ServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceHandler {

    @Autowired
    ServiceFactory serviceFactory;

    public void getService(final String serviceType){
        ServiceIdentifier serviceIdentifier = serviceFactory.getService(serviceType);
        serviceIdentifier.getService();
    }

}
