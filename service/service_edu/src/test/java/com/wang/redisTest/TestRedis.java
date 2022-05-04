package com.wang.redisTest;

import com.wang.EducationApplication;
import com.wang.commonutils.RedisUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EducationApplication.class)
public class TestRedis {
    @Autowired
    RedisUtils redisUtils;

    @Test
    public void testRedis1() {
//        String l = redisUtils.getValueByKey("name");
//        System.out.println("l = " + l);
//        System.out.println("dsadas");
          Set<String> keys = redisUtils.getAllKeys("*");
          System.out.println("keys = " + keys);
    }
}
