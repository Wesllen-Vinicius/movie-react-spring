package com.example.reactmovie.controllers;

import com.example.reactmovie.controllers.dto.UserDto;
import com.example.reactmovie.models.User;
import com.example.reactmovie.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin(originPatterns = "x", maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<UserDto> list(String userName){
        if(userName == null) {
            List<User> users = userRepository.findAll();
            return UserDto.convert(users);
        } else {
            List<User> users = userRepository.findUserByName(userName);
            return UserDto.convert(users);
        }
    }

//    @RequestMapping(value="/findUserById/{id}", method = RequestMethod.GET)
}
