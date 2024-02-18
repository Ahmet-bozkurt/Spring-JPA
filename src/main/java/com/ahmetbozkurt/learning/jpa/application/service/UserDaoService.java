package com.ahmetbozkurt.learning.jpa.application.service;

import com.ahmetbozkurt.learning.jpa.application.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class UserDaoService {
    @PersistenceContext
    private EntityManager entityManager;

    public Long insertUser(User user) {

        entityManager.persist(user);

        return user.getId();
    }

    /*
     *   User cagkan = new User("cagkan","Admin")
     *   User rana = new User("cagkan","Admin")
     *
     *   entityManager.persist(Cagkan)
     *
     *   Persistence Context
     *   cagkan.setRole("User");
     *   rana.setRole("User");
     */
}
