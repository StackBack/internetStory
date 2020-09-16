package com.example.demo.repository;

import com.example.demo.domain.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<CustomUser, Long> {
    boolean existsByUserName(String userName);
    CustomUser findByUserName(String userName);
}
