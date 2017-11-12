package com.uxpsystems.assignement.service;

import com.uxpsystems.assignement.model.User;
import com.uxpsystems.assignement.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
   
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }
    
    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }


    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
