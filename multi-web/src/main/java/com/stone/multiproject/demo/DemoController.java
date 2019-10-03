package com.stone.multiproject.demo;

import com.stone.multiproject.mapper.UserMapper1;
import com.stone.multiproject.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/")
    public String demo() {
        return this.getClass().toGenericString();
    }

    @Resource
    UserMapper1 userMapper1;

    @GetMapping("/get")
    public User find() {
        return userMapper1.selectById(1L);
    }
}
