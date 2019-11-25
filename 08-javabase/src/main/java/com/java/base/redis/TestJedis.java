package com.java.base.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class TestJedis {

    private static JedisPool pool = null;

    public TestJedis(){
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        // 最大空闲数
        poolConfig.setMaxIdle(50);
        // 最大连接数
        poolConfig.setMaxTotal(100);
        // 最大等待毫秒数
        poolConfig.setMaxWaitMillis(20000);

        pool = new JedisPool(poolConfig,"192.168.0.104");
    }

    public static void main(String[] args) {
        // Jedis jedis = new Jedis("192.168.0.104",6379,100000);
        TestJedis tt = new TestJedis();
        Jedis resource = pool.getResource();
        int i = 600;
        long start = System.currentTimeMillis();
        try {
            while (true) {
                long end = System.currentTimeMillis();
                if (end - start >= 1000) {
                    break;
                }
                i++ ;
                resource.set("test"+i,i+"value");
            }
        } finally {
            resource.close();
        }
        System.out.println("jedis:" + i);
    }

}
