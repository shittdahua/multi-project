package com.stone.multiproject.test.mapper;

import com.stone.multiproject.mapper.UserMapper;
import com.stone.multiproject.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Resource
    UserMapper userMapper;

    @Test
    public void demo() {
        User user = userMapper.selectById(1);
        Assert.assertTrue(user != null);
        System.out.println(user);
    }
}
