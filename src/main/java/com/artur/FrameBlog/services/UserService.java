package com.artur.FrameBlog.services;

import com.artur.FrameBlog.models.User;

import java.util.List;

public interface UserService {
    User save(User user);
    List<User> getAll();
    User get(Long id);
    User update(Long id, User user);
    void delete(Long id);
}
