package com.example.demo.controller;

import jdk.nashorn.internal.runtime.ECMAException;
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
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * @Author: FAN
 * @Description:TODO
 * @Date: Create in 20:53 2018/8/1
 * @Modify By:
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderControllerTests {
    @Autowired
    private WebApplicationContext context;
    private MockMvc mvc;
    @Before
    public void setupMockMvc() throws Exception {
        mvc = MockMvcBuilders.webAppContextSetup(context).build();
    }
    @Test
    public void testOrder() throws Exception {
        mvc.perform(get("http://localhost:8080/demo/order/show")).andDo(print());
    }

}
