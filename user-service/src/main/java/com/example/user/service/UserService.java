package com.example.user.service;

import com.example.user.bean.User;

public interface UserService {
    User saveUser(User user);

    User getUserByName(String name);

}
