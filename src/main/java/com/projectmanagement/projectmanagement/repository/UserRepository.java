package com.projectmanagement.projectmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projectmanagement.projectmanagement.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
}
