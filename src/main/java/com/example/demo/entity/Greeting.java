package com.example.demo.entity;

/**
 * @Author: FAN
 * @Description:TODO
 * @Date: Create in 17:59 2018/7/30
 * @Modify By:
 **/
public class Greeting {
    private final long id;
    private final String content;
    public Greeting(long id,String content){
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
