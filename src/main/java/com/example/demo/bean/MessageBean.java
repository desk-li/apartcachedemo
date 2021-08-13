package com.example.demo.bean;

import lombok.Data;

import java.io.InputStream;

/**
 * Created by desk
 *
 * @date 2021/8/12
 */
@Data
public class MessageBean {
    String title;
    InputStream stream;

    public MessageBean(String title, InputStream stream) {
        this.title = title;
        this.stream = stream;
    }
}
