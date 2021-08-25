package com.example.demo;

import com.apartcache.starter.config.interceptor.CacheAdvice;
import com.apartcache.starter.config.redis.RedisCacheManager;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.apartcache.starter.mapper")
@SpringBootApplication
public class ApartcachedemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApartcachedemoApplication.class, args);
    }

}
