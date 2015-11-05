package com.mycompany.credentialsApp.controller;

import com.mycompany.credentialsApp.dao.UserDao;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import sun.security.acl.PrincipalImpl;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

//@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
//@ActiveProfiles("test")
public class UserControllerTest {

 /*   private MockMvc mockMvc;

    @Autowired
    private UserDao userDao;

    @Autowired
    private WebApplicationContext wac;

    @Before
    public void init() {
        mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void testList() throws Exception {
        mockMvc.perform(get("/user")
                .contentType(MediaType.APPLICATION_JSON)
                .content("200")
                .accept(MediaType.APPLICATION_JSON)
                .principal(new PrincipalImpl("user")))
                .andDo(print())
                .andExpect(status().isOk());
    }*/
}
