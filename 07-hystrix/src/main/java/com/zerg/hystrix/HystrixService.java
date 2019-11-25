package com.zerg.hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@Service
public class HystrixService {

    @Autowired
    RestTemplate template;

    @HystrixCommand(fallbackMethod = "defaultMethod")
    public String getHello(){
        return template.getForObject("http://provider/hello",String.class);
    }

    private String defaultMethod(){
        return "defaultMethod";
    }

}
