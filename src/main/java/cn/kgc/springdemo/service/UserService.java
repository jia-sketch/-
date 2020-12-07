package cn.kgc.springdemo.service;

import cn.kgc.springdemo.mapper.UserMapper;
import cn.kgc.springdemo.pojo.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Author: 贾浩然
 * 类名:UserService
 * 创建时间: 2020/10/21 9:52
 */

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;
    //根据id查询
    public User queryById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }
    //新增用户
    @Transactional
    public void saveUser(User user){
        System.out.println("新增用户");
        //选择性新增，如果属性为空则该属性不会出现在insert语句中
        userMapper.insertSelective(user);
        int i=1/0;
    }
}
