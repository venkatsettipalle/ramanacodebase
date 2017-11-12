package com.uxpsystems.assignement.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
