package cn.kgc.springdemo.controller;

import cn.kgc.springdemo.pojo.User;
import cn.kgc.springdemo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @Author: 贾浩然
 * 类名:Hello
 * 创建时间: 2020/10/21 9:04
 */

@RestController
public class Hello {

    @Resource
    private DataSource dataSource;
    @Resource
    private UserService userService;

    /**
     * 根据用户id查询用户
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    public User queryById(@PathVariable Long id){
        return userService.queryById(id);
    }
    @RequestMapping("hello")
    public String Hello(){
        System.out.println("datasource"+dataSource);
        return "spring boot!";
    }
}
