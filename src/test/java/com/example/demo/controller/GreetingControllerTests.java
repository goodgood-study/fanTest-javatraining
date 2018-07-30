package com.example.demo.controller;
import com.sun.xml.internal.bind.v2.TODO;
import jdk.nashorn.internal.runtime.ECMAException;
import org.jboss.logging.Param;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.print.attribute.standard.Media;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

/**
 * @Author: FAN
 * @Description: the method of Test
 * @Date: Create in 18:03 2018/7/30
 * @Modify By:
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class GreetingControllerTests {
    @Autowired
    private WebApplicationContext context;
    private MockMvc mvc;
    @Before
    public void setupMockMvc() throws Exception {
       mvc = MockMvcBuilders.webAppContextSetup(context).build();
    }
    /**
    *  @Author:FAN
    *  @Param:
    *  @Description: get
    *  @Date: 23:28 2018/7/30
    *  @Return:
    **/
    @Test
    public void testSayHello() throws Exception{
        mvc.perform(get("http://localhost:8080/greetingGet").param("name","value").accept(MediaType.TEXT_HTML));
    }
    /**
    *  @Author:FAN
    *  @Param:
    *  @Description: post
    *  @Date: 23:29 2018/7/30
    *  @Return:
    **/
    @Test
    public void testSayHello1() throws Exception{
        mvc.perform(post("http://localhost:8080/greetingPost").param("name","FAN2").accept(MediaType.TEXT_HTML));
    }
    /**
    *  @Author:FAN
    *  @Param:
    *  @Description: put
    *  @Date: 23:30 2018/7/30
    *  @Return:
    **/
    @Test
    public void testSayHello2() throws Exception{
        mvc.perform(put("http://localhost:8080/greetingPut/FAN").accept(MediaType.TEXT_HTML));
    }
    /**
    *  @Author:FAN
    *  @Param:
    *  @Description: delete
    *  @Date: 23:30 2018/7/30
    *  @Return:
    **/
    @Test
    public void testSayHello3() throws Exception{
        mvc.perform(delete("http://localhost:8080/greetingDelete/FAN").accept(MediaType.TEXT_HTML));
    }
}
