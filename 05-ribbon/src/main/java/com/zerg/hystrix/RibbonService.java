package com.zerg.hystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

    @Autowired
    RestTemplate template;

    public String getHello(){
        return template.getForObject("http://provider/hello",String.class);
    }
}
