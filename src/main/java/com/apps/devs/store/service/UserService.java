package com.apps.devs.store.service;

import com.apps.devs.store.model.User;

public interface UserService {

    User createUser(String firstName, String lastName, String email, String password, String confirmedPassword);


}
