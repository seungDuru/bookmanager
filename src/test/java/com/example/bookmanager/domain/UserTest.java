package com.example.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void test(){
        User user = new User();
        user.setEmail("martin@gmail.com");
        user.setName("martin");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

//        User user1 = new User(null, "martin", "martin@gmail.com", LocalDateTime.now(), LocalDateTime.now());
        User user2 = new User("martin", "martin@gmail.com");

        System.out.println(">>> " + user.toString());
    }

}