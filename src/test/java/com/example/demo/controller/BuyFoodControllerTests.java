package com.example.demo.controller;

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

/**
 * @Author: FAN
 * @Description:TODO
 * @Date: Create in 23:02 2018/7/31
 * @Modify By:
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class BuyFoodControllerTests {
    @Autowired
    private WebApplicationContext context;
    private MockMvc mvc;
    @Before
    public void setupMockMvc() throws Exception {
        mvc = MockMvcBuilders.webAppContextSetup(context).build();
    }
    @Test
    public void testBuyFood() throws Exception{
        mvc.perform(get("http://localhost:8080//sell/buyer/product/list").accept(MediaType.APPLICATION_JSON_UTF8));
    }
}
