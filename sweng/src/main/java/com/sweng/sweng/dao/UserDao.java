package com.sweng.sweng.dao;

import com.sweng.sweng.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
