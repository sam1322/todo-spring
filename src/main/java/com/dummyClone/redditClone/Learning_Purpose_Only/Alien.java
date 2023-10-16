package com.dummyClone.redditClone.Learning_Purpose_Only;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Data
@Component
//@Scope(value = "prototype")
public class Alien {
    private int Aid;
    private String aname;
    @Autowired
    @Qualifier("lap1")
    private Laptop laptop;

    private String tech;

    public Alien() {
        super();
        System.out.println("Alien Object created.....");
    }

    public void show() {
        System.out.println("Showing Alien");
        laptop.compile();
    }
}
