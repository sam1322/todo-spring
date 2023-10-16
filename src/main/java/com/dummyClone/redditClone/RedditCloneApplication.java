package com.dummyClone.redditClone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RedditCloneApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(RedditCloneApplication.class, args);
//        Alien a = context.getBean(Alien.class);
//        a.show();
//        Alien a1 = context.getBean(Alien.class);
//        a1.show();
//        System.out.println(a);
//        System.out.println(a1);
    }

}
