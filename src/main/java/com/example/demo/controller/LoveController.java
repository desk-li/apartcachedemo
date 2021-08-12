package com.example.demo.controller;

import com.example.demo.service.Love;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lsq
 *
 * @date 2021/8/11
 */
@RestController
@RequestMapping("/say")
public class LoveController {

    @Autowired
    Love love;

    @RequestMapping("/love")
    public String sayLove(){
        return love.sayLove();
    }
}
