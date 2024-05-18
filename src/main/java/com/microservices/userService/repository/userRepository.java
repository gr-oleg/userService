package com.microservices.userService.repository;

import com.microservices.userService.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface userRepository extends JpaRepository<user, Long> {
    user findByEmail(String email);
    Optional<user> findById(Long id);
}
