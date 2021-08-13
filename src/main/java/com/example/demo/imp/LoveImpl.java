package com.example.demo.imp;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bean.MessageBean;
import com.example.demo.bean.ReturnBean;
import com.example.demo.bean.User;
import com.example.demo.service.Love;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by lsq
 *
 * @date 2021/8/11
 */
@Component
public class LoveImpl implements Love {
    @Override
    public String sayLove() {
        System.out.println("调用了sayLove方法");
        return "I love you !";
    }

    @Override
    public String saySomething(String some) {
        System.out.println("调用了saySomething方法");
        return some;
    }

    @Override
    public String sayJokes(List<String> list) {
        System.out.println("调用了sayJokes方法");
        return JSONObject.toJSONString(list);
    }

    @Override
    public ReturnBean passOntransmit(User user, MessageBean msg) {
        System.out.println("调用了passOntransmit方法");
        String ss = JSONObject.toJSONString(user)+"      "+ JSONObject.toJSONString(msg);
        ReturnBean returnBean = new ReturnBean();
        returnBean.setRes(ss);
        return returnBean;
    }
}
