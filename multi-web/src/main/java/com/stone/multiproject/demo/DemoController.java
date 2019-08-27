package com.stone.multiproject.demo;

import com.stone.multiproject.mapper.UserMapper;
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
    UserMapper userMapper;

    @GetMapping("/get")
    public User find() {
        return userMapper.selectById(1L);
    }
}
