package com.example.demo.imp;

import com.example.demo.service.Love;
import org.springframework.stereotype.Component;

/**
 * Created by lsq
 *
 * @date 2021/8/11
 */
@Component
public class LoveImpl implements Love {
    @Override
    public String sayLove() {
        return "I love you !";
    }
}
