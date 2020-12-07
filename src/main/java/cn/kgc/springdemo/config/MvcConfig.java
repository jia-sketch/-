package cn.kgc.springdemo.config;

import cn.kgc.springdemo.interceptor.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: 贾浩然
 * 类名:MvcConfig
 * 创建时间: 2020/10/21 9:36
 */

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    //注册拦截器
    @Bean
    public MyInterceptor myInterceptor(){
        return new MyInterceptor();
    }
    //添加拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor()).addPathPatterns("/*");
    }
}
