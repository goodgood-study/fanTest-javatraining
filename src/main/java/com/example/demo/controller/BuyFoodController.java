package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.service.IFoodService;
import com.example.demo.service.impl.FoodServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


/**
 * @Author: FAN
 * @Description:TODO
 * @Date: Create in 16:25 2018/7/31
 * @Modify By:
 **/
@Slf4j
@RestController
@RequestMapping("/sell/buyer")
public class BuyFoodController {
    IFoodService service = new FoodServiceImpl();
    @GetMapping ("/product/list")
    public JSON ChooseFood(){
        System.out.println(service.showFoods());
        //TRACE < DEBUG < INFO < WARN < ERROR < FATAL
        log.info("info++++++");
        log.debug("debug-----");
        log.warn("warn******");
        log.error("error/////");
        return service.showFoods();

    }
}
