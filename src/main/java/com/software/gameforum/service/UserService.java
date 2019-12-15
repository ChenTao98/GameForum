package com.software.gameforum.service;

import com.software.gameforum.entity.User;

public interface UserService {
    public int register(User user);
    public User login(String username,String password);
}
