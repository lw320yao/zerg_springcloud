package com.zerg.hystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    RibbonService service;

    @GetMapping("/getHello")
    public String getHello(){
        return service.getHello();
    }
}
