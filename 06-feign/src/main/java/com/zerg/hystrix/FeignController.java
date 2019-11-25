package com.zerg.hystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    FeignService service;

    @GetMapping("/feign/getHello")
    public String getHello(){
        return service.hello();
    }
}
