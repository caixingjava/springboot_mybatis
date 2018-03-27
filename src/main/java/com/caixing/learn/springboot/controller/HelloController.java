package com.caixing.learn.springboot.controller;

import com.caixing.learn.springboot.entity.User;
import com.caixing.learn.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class HelloController {


    @Autowired
    private UserService service;

    @GetMapping("/create")
    @ResponseBody
    public String createUser() {
        String msg = "添加成功";
        User user = new User();
        user.setName("caixing");
        try {
            int num = service.createUser(user);
            if (num < 1) {
                msg = "添加失败";
            }
        } catch (Exception e) {
            msg = "添加失败";
        }
        return msg;
    }
}
