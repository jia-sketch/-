package cn.kgc.springdemo.service;

import cn.kgc.springdemo.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Resource
    private UserService userService;
    @Test
    public void queryById() {
        User user = userService.queryById(8L);
        System.out.println("user="+user);
    }

    @Test
    public void saveUser() {
        User user = new User();
        user.setUserName("test2");
        user.setUserCode("admin");
        user.setUserPassword("123456");
        userService.saveUser(user);
    }
}