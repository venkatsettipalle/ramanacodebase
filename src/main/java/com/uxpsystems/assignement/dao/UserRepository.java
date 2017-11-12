package com.uxpsystems.assignement.dao;

import com.uxpsystems.assignement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
