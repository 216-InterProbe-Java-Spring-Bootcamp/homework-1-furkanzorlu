package com.example.homework1.homework1.dao;

import com.example.homework1.homework1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
}
