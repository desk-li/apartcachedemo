package com.example.demo.service;

import com.example.demo.bean.MessageBean;
import com.example.demo.bean.ReturnBean;
import com.example.demo.bean.User;

import java.util.List;

/**
 * Created by desk
 *
 * @date 2021/8/11
 */
public interface Love {

    String sayLove();

    String saySomething(String some);

    String sayJokes(List<String> list);

    ReturnBean passOntransmit(User user, MessageBean msg);
}
