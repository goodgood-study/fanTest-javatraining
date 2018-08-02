package com.example.demo.entity;

import java.util.List;

/**
 * @Author: FAN
 * @Description:TODO
 * @Date: Create in 17:39 2018/8/1
 * @Modify By:
 **/
public class OrderResult {
    private Integer code;
    private String msg;
    private List<Order> date;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<Order> getDate() {
        return date;
    }

    public void setList(List<Order> date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "OrderResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", date=" + date +
                '}';
    }
}
