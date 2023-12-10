package com.example.restapifinal.service;

import com.example.restapifinal.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

    User getUserById(Long id);

    void addUser(User user);

    void updateUser(long id, User updatedUser);

    void deleteUserById(Long id);

    User findUserByName(String name);
}
