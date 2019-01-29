package com.example.demo.controller;

import com.example.demo.domin.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/queryAllById")
    public List<User> queryAllById(Long id) {

        List<User> result = userService.queryAllById(id);
        return result;
    }

    @PostMapping("/queryAllByName")
    public List<User> queryAllByName(@Param("id") String name) {

        List<User> result = userService.queryAllByName(name);
        return result;

    }

}
