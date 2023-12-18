package com.kbc.java17.practice.iostreams;

import java.io.Serializable;

public class Address  {

    private int doorNo;
    private String street = "test";
    private String city = "test";
    Address(int doorNo, String street, String city){
        System.out.println("Address 2-arg constructor is called...");
        this.doorNo=doorNo;
        this.street=street;
        this.city=city;
    }

    public String toString(){
        return "DoorNo="+doorNo+", Street="+street+", City="+city;
    }
}
