package com.wang;

import com.wang.commonutils.RedisUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;

public class TestJedis {


    @Test
    public void some() {
        Jedis jedis = new Jedis("192.168.247.135", 6379);
        String result = jedis.ping();
        System.out.println(result);
    }
}
