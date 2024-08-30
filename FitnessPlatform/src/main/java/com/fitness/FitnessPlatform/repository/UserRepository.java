package com.fitness.FitnessPlatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fitness.FitnessPlatform.entity.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long> {
    User findByEmail(String email);
}