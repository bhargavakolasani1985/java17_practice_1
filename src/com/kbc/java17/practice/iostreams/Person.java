package com.kbc.java17.practice.iostreams;

import java.io.Serializable;

public class Person implements Serializable {

    private int age;
    private String name = "test";

    private static int salary = 1000;

    private Address address = null;
    Person(int age, String name){
        System.out.println("Person 2-arg constructor is called...");
        this.age=age;
        this.name=name;
    }

    public String toString(){
        return "Age="+age+", Name="+name+", Salary="+salary+";"+this.address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getSalary() {
        return salary;
    }

    public static void setSalary(int salary) {
        Person.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
