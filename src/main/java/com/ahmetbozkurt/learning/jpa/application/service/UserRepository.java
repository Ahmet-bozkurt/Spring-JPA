package com.ahmetbozkurt.learning.jpa.application.service;

import com.ahmetbozkurt.learning.jpa.application.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
