package com.example.PP311.springBoot.dao;





import com.example.PP311.springBoot.models.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    void deleteUser(Long id);
}
