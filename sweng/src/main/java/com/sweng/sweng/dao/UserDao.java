package com.sweng.sweng.dao;

import com.sweng.sweng.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UserDao extends JpaRepository<User, Integer> {
    User findByEmailById(@Param("email") String email);
}
