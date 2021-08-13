package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.bean.MessageBean;
import com.example.demo.bean.ReturnBean;
import com.example.demo.bean.User;
import com.example.demo.service.Love;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    @RequestMapping(value = "/love", method = RequestMethod.GET)
    public String sayLove(){
        return love.sayLove();
    }

    @RequestMapping(value = "/saySomething", method = RequestMethod.POST)
    @ResponseBody
    public String saySomething(@RequestBody String some) {
        JSONObject jsonObject = JSONObject.parseObject(some);
        String say = jsonObject.getString("some");
        return love.saySomething(say);
    }

    @RequestMapping(value = "/sayJokes", method = RequestMethod.POST)
    @ResponseBody
    public String sayJokes(@RequestBody String list) {
        JSONObject jsonObject = JSONObject.parseObject(list);
        JSONArray jsonArray = JSONObject.parseArray(jsonObject.getString("list"));
        List<JSONArray> jsonArrays = Arrays.asList(jsonArray);
        List<String> collect = jsonArrays.stream().map(JSON::toString).collect(Collectors.toList());
        return love.sayJokes(collect);
    }

    @RequestMapping(value = "/passOntransmit", method = RequestMethod.POST)
    @ResponseBody
    public ReturnBean passOntransmit(@RequestBody String message) {
        JSONObject jsonObject = JSONObject.parseObject(message);
        String user1 = jsonObject.getString("user");
        User user2 = JSONObject.parseObject(user1, User.class);
        String msg = jsonObject.getString("msg");
        MessageBean msg2 = JSONObject.parseObject(msg, MessageBean.class);
        return love.passOntransmit(user2, msg2);
    }
}
