package com.ct.centimeDatabase.controller;


import com.ct.centimeDatabase.entities.UserDetails;
import com.ct.centimeDatabase.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDetailsController {

    private final UserDetailsService userDetailsService;

    @Autowired
    public UserDetailsController(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @GetMapping(path = "/centime/api/v1/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDetails> getUsers(@PathVariable("userId") Long id){
        return ResponseEntity.status(HttpStatus.OK).body(userDetailsService.getUsers(id));
    }
}
