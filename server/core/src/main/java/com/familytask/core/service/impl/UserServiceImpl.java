package com.familytask.core.service.impl;

import com.familytask.core.model.User;
import com.familytask.core.repository.UserRepository;
import com.familytask.core.service.UserService;
import jakarta.transaction.Transactional;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        log.info("Save user to database: {}", user.getUsername());
        return userRepository.save(user);
    }

    @Override
    public User getUser(String username) {
        log.info("Get user: {}", username);
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> getUsers() {
        log.info("Get all users");
        return userRepository.findAll();
    }
}
