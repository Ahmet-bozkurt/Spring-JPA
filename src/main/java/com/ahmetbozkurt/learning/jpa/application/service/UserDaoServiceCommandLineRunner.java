package com.ahmetbozkurt.learning.jpa.application.service;

import com.ahmetbozkurt.learning.jpa.application.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

    @Autowired
    UserDaoService userDaoService;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Cagkan", "Admin");

        userDaoService.insertUser(user);
    }
}
