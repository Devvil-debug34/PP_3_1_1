package com.example.PP311.springBoot.service;




import com.example.PP311.springBoot.models.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    void deleteUser(Long id);
}
