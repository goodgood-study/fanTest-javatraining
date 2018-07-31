package com.example.demo.controller;

import com.example.demo.entity.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author: FAN
 * @Description:TODO
 * @Date: Create in 17:59 2018/7/30
 * @Modify By:
 **/
@RestController    //默认返回json数据
public class GreetingController {
    private static final String template = "Hello,%s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/greetingGet", method = RequestMethod.GET)
    public Greeting greetingGet(@RequestParam(value = "name", defaultValue = "world") String name) {
        System.out.println(name);
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));

    }

    @RequestMapping(value = "/greetingPost",method = RequestMethod.POST)
    public String greetingPost(@RequestParam(value = "name",defaultValue = "FAN") String name){
        System.out.println(name);
        return String.format(template,name);
    }
    @RequestMapping(value = "/greetingPut/{name}",method = RequestMethod.PUT)
    public String greetingPut(@PathVariable("name") String name){
        System.out.println("");
        return String.format(template,name);
    }
    @RequestMapping(value = "greetingdelete/{name}",method = RequestMethod.DELETE)
    public  String greetingDelete(@PathVariable("name") String name){
        return String.format(template,name);
        }
    }
