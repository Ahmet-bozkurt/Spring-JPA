package com.ahmetbozkurt.learning.jpa.application.service;

import com.ahmetbozkurt.learning.jpa.application.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

    @Autowired
    UserDaoService userDaoService;

    private final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {

        User user = new User("Cagkan", "Admin");

        userDaoService.insertUser(user);

        log.info("New user created: " + user);
    }
}
