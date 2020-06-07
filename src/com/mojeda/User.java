package com.mojeda;

public class User {
    //Attributes
    public String name;
    //Constructor
    public User(String name){
        this.name = name;
    }
    //Methods
public void sayHello(){
    System.out.println("Hi, my name is "+ name);
}
}
