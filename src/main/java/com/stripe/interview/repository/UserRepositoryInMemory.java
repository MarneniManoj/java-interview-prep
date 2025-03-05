package com.stripe.interview.repository;

import com.stripe.interview.dto.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class UserRepositoryInMemory implements UserRepository{

    Map<String,User> userNameMap;

    public UserRepositoryInMemory(Map<String, User> userMap) {
        this.userNameMap = new HashMap<>();
    }

    @Override
    public Optional<User> findByUsername(String username) {
        User user = this.userNameMap.get(username);
        return Optional.of(user);
    }

    @Override
    public User save(User user) {
        this.userNameMap.put(user.getUsername(), user);
        return this.userNameMap.get(user.getUsername());
    }
}
