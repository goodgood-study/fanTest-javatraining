package com.example.demo.controller;
import com.sun.media.jfxmedia.logging.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
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
       /* String result = mvc.perform(get("/greetingGet")
                .param("name","New")
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(3))
                .andReturn().getResponse().getContentAsString();
        System.out.println(result);*/
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
