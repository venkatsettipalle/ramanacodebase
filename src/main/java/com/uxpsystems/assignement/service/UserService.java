package com.uxpsystems.assignement.service;

import com.uxpsystems.assignement.model.User;

public interface UserService {
    void save(User user);
    void delete(User user);

    User findByUsername(String username);
}
