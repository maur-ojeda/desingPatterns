package com.mojeda;

public class Main {

    public static void main(String[] args) {
        User user = new User("mauricio");
        System.out.println(user.name);
        user.sayHello();
    }
}
