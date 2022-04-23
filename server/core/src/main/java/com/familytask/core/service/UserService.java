package com.familytask.core.service;

import com.familytask.core.model.User;
import java.util.List;

public interface UserService {

    User saveUser(User user);

    User getUser(String username);

    List<User> getUsers();

}
