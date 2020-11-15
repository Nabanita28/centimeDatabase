package com.ct.centimeDatabase.service;

import com.ct.centimeDatabase.entities.UserDetails;
import com.ct.centimeDatabase.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserDetailsService {

    private final UserRepository userRepository;

    public UserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public UserDetails getUsers(Long id) {
        Optional<UserDetails> userDetail = userRepository.findById(id);
        return userDetail.get();
    }
}
