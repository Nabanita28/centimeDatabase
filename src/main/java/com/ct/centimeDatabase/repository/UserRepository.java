package com.ct.centimeDatabase.repository;

import com.ct.centimeDatabase.entities.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserDetails, Long> {
    Optional<UserDetails> findById(long id);
}
