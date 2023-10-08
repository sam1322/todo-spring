package com.dummyClone.redditClone;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {
    private int lid;
    private String brand ;
    public void setBrand(String  brand){
        this.brand = brand;
    }

//    @Override
//    public String toString(){
//        return "Laptop [lid=" + lid + ", brand= " + brand + "]" ;
//    }

    public void compile(){
        System.out.println("compiling");
    }
}
