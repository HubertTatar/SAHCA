package com.mycompany.credentialsApp.dao;

import com.mycompany.credentialsApp.model.User;

import java.util.List;

public interface UserDao {
    void create(User user);
    void delete(User user);
    List<User> getAll();
    User getByEmail(String email);
    User getById(long id);
    void update(User user);
}
