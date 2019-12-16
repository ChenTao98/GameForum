package com.software.gameforum.service;

import com.software.gameforum.entity.User;
import com.software.gameforum.entity.Userfollowgames;

public interface UserService {
    int register(User user);

    User login(String username, String password);

    int modifyInfo(User user);

    User getUserById(int id);

    int userFollowGame(Userfollowgames userfollowgames);
}
