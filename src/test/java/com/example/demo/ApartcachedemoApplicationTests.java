package com.example.demo;

import com.apartcache.starter.config.CacheNameGenerator;
import com.apartcache.starter.config.ServiceManager;
import com.apartcache.starter.config.interceptor.CacheAdvice;
import com.apartcache.starter.config.redis.RedisCacheManager;
import com.apartcache.starter.mapper.CacheDataMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class ApartcachedemoApplicationTests {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void contextLoads() {
        CacheDataMapper bean = applicationContext.getBean(CacheDataMapper.class);
        String[] beanNamesForType = applicationContext.getBeanNamesForType(ServiceManager.class);
        String[] beanNamesForType3 = applicationContext.getBeanNamesForType(RedisCacheManager.class);
        String[] beanNamesForType2 = applicationContext.getBeanNamesForType(CacheAdvice.class);
        String[] beanNamesForType1 = applicationContext.getBeanNamesForType(CacheNameGenerator.class);

        Object cacheServiceManager = applicationContext.getBean("cacheServiceManager");
        Object dBServiceManager = applicationContext.getBean("dBServiceManager");
        Object cacheI = applicationContext.getBean("cacheI");
        Integer n = bean.count();
        System.out.println(bean.toString());
    }

}
