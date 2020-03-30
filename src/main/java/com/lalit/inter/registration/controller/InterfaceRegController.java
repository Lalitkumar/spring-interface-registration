package com.lalit.inter.registration.controller;

import com.lalit.inter.registration.service.ServiceHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterfaceRegController {

    @Autowired
    ServiceHandler serviceHandler;

    @GetMapping("/testregistration/{regIndicator}")
    public String testReg(@PathVariable("regIndicator") String serviceType){
        serviceHandler.getService(serviceType);
        return "Yay..!!";
    }
}
