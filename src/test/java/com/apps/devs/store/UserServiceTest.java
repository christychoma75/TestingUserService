package com.apps.devs.store;

import com.apps.devs.store.model.User;
import com.apps.devs.store.service.UserService;
import com.apps.devs.store.service.UserServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserServiceTest {
    @DisplayName("User Object created.")
    @Test
    void testCreateUser_whenUserDetailsProvided_returnUserObject(){
        //Arrange
        UserService userService = new UserServiceImpl();
        String firstName = "Christy";
        String lastName = "Choma";
        String email = "Christychoma75@gmail.com";
        String password = "Webdev2024?";
        String confirmedPassword = "Webdev2024?";
        //Act
        User user = userService.createUser(firstName, lastName, email, password, confirmedPassword);

        //Assert
        assertNotNull(user,"The createUser() should not have returned null");
        assertEquals(firstName, user.getFirstName(), "User firstName is incorrect");
        assertEquals(lastName, user.getLastName(),"User lastName is incorrect");
        assertEquals(email, user.getEmail(),"User email is incorrect");

    }
}
