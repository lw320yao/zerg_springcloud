package com.springcloud.provider.controller;

import com.netflix.discovery.DiscoveryClient;
import com.springcloud.provider.bean.SysUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "value test")
@RestController
public class HelloController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Value("${server.port}")
    private String port;

    @ApiOperation(value="查看hello",notes="提示信息",httpMethod = "GET")
    @RequestMapping(value="/hello",method= RequestMethod.GET)
    public String hello(){
        return "hello" + port ;
    }

    @GetMapping("/redis/string")
    @ApiOperation(value="设置redis的值",httpMethod = "GET")
    public String setRedisKey(){
        stringRedisTemplate.opsForValue().set("key2", "value2");
        long start = System.currentTimeMillis();
        int i = 0;
        while(true){
            long end = System.currentTimeMillis();
            if (end - start >= 1000) {
                break;
            }
            i++;
            stringRedisTemplate.opsForValue().set("key"+i,"value"+i);
        }
        return i+"";
    }
    @GetMapping("/redis/obj")
    @ApiOperation(value="设置redis的值",httpMethod = "GET")
    public SysUser setRedisObj(){
        long start = System.currentTimeMillis();
        int i = 0;
        while(true){
            long end = System.currentTimeMillis();
            if (end - start >= 1000) {
                break;
            }
            i++;
            SysUser user = new SysUser( Long.valueOf(i),"password","username");
            redisTemplate.opsForValue().set("user"+i,user);
        }
        return (SysUser) redisTemplate.opsForValue().get("user1");
    }
}
