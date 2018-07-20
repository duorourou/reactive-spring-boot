package com.duorourou.reactive.practices.controller;

import com.duorourou.reactive.practices.domain.User;
import com.duorourou.reactive.practices.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.Objects;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

//@RestController
//@RequestMapping(path = "/users", produces = APPLICATION_JSON_UTF8_VALUE,
//consumes = APPLICATION_JSON_UTF8_VALUE)
public class UserController {

//    @Autowired
//    private UserRepository userRepository;
//
//    @GetMapping(path = "/{name}")
//    public Mono<User> getByName(@PathVariable String name) {
//        return userRepository.findByName(name);
//    }
//
//    @PostMapping
//    public Mono<User> createUser(@RequestBody Mono<User> user) {
//        return userRepository.save(Objects.requireNonNull(user.filter(Objects::nonNull).block()));
//    }
}
