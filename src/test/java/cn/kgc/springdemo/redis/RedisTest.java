package cn.kgc.springdemo.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

/**
 * @Author: 贾浩然
 * 类名:RedisTest
 * 创建时间: 2020/10/24 14:11
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Resource
    private RedisTemplate redisTemplate;
    @Test
    public void test(){
        //字符串
//        redisTemplate.opsForValue().set("str","jhr");
//        System.out.println("str ="+ redisTemplate.opsForValue().get("str"));
//        //hash 散列
//        redisTemplate.boundHashOps("h_key").put("name","heima");
//        redisTemplate.boundHashOps("h_key").put("age",13);
//        //获取所有域
//        Set set=redisTemplate.boundHashOps("h_key").keys();
//        System.out.println("hash散列的所有域:"+set);
//        //获取所有值
//        List list = redisTemplate.boundHashOps("h_key").values();
//        System.out.println("hans散列的所有域的值:"+list);
//        //list列表
//        redisTemplate.boundListOps("1_key").leftPush("c");
//        redisTemplate.boundListOps("1_key").leftPush("b");
//        redisTemplate.boundListOps("1_key").leftPush("a");
//        //获取全部元素
//        list=redisTemplate.boundListOps("1_key").range(0,-1);
//        System.out.println("list列表中的所有元素:"+list);
//        //set集合
//        redisTemplate.boundSetOps("s_key").add("a","b,","c");
//        set=redisTemplate.boundSetOps("s_key").members();
//        System.out.println("set集合中的所有元素:"+set);
        //sorted set 有序集合
        redisTemplate.boundZSetOps("z_key").add("a",30);
//        redisTemplate.boundZSetOps("z_key").add("b",20);
//        redisTemplate.boundZSetOps("z_key").add("c",10);
       Set set=redisTemplate.boundZSetOps("z_key").range(0,-1);
        System.out.println("有序集合的所有元素"+set);
    }
}
