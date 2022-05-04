package com.wang.commonutils;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import java.util.Set;

@Component
public class RedisUtils {

    Jedis jedis = new Jedis("192.168.247.135", 6379);

    public String getValueByKey(String key) {
        return jedis.get(key);
    }
    public Set<String> getAllKeys(String keys) {
        return jedis.keys(keys);
    }
}
