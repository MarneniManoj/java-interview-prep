package com.stripe.interview.repository;

import com.stripe.interview.dto.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findByUsername(String username);

    User save(User user);
}
