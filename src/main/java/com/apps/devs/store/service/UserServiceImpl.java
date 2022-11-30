package com.apps.devs.store.service;

import com.apps.devs.store.model.User;
import com.apps.devs.store.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User createUser(String firstName, String lastName, String email, String password, String confirmedPassword) {

        return new User(firstName, lastName, email);
    }
}
