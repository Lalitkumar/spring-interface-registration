package com.lalit.inter.registration.factory;

import com.lalit.inter.registration.service.ServiceIdentifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServiceFactory {

    @Autowired
    List<ServiceIdentifier> serviceIdentifiers;

   public ServiceIdentifier getService(String serviceType){
        ServiceIdentifier serviceIdentifier = serviceIdentifiers.stream()
                .filter(obj -> obj.serviceType(serviceType))
                .findFirst().get();

        return serviceIdentifier;
    }
}
