package com.example.CozyStay.repo;

import com.example.CozyStay.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User , Long> {
    boolean existsAllByEmail(String email);
    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);
}
