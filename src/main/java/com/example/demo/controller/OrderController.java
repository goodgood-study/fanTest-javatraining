package com.example.demo.controller;

import com.example.demo.entity.Order;
import com.example.demo.entity.OrderResult;
import com.sun.org.apache.xpath.internal.operations.Or;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: FAN
 * @Description:TODO
 * @Date: Create in 17:42 2018/8/1
 * @Modify By:
 **/
@Slf4j
@RestController
@RequestMapping("/demo")
public class OrderController {
    private Order order1 = new Order();
    private Order order2 = new Order();
    OrderResult result = new OrderResult();
    List<Order> list = new ArrayList<Order>();
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date date;
    {
        try {
            date = df.parse("2018-10-10 10:10:10");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void addOrder() throws Exception{
        order1.setOrderId("161873371171128075");
        order1.setBuyerName("张三");
        order1.setBuyerPhone("18869977111");
        order1.setBuyerAddress("GangDing Station");
        order1.setBuyerOpenid("?????");
        order1.setOrderAmount(0);
        order1.setOrderStatus(0);
        order1.setPayStatus(0);
        order1.setUpdateTime(date);
        order1.setCreateTime(date);
        order1.setOrderDetailList(null);

        list.add(order1);

        order2.setOrderId("161873371171128075");
        order2.setBuyerName("张三");
        order2.setBuyerPhone("18869977111");
        order2.setBuyerAddress("Baiyun Station");
        order2.setBuyerOpenid("?????");
        order2.setOrderAmount(0);
        order2.setOrderStatus(0);
        order2.setPayStatus(0);
        order2.setCreateTime(date);
        order2.setUpdateTime(date);
        order2.setOrderDetailList(null);

        list.add(order2);
        result.setCode(0);
        result.setMsg("success");
        result.setList(list);
    }

    @GetMapping("/order/show")
     public OrderResult showOrder() throws Exception{
        this.addOrder();
        //TRACE < DEBUG < INFO < WARN < ERROR < FATAL。
        log.error("error");
        log.warn("warn");
        log.info("info");
        log.debug("debug");
        log.trace("trace");
        return result;
    }
}
