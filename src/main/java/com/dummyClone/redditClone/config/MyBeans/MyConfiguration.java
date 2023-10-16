package com.dummyClone.redditClone.config.MyBeans;


import com.dummyClone.redditClone.config.MyBeans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public MyBean myBean() {
        return new MyBean();
    }

}