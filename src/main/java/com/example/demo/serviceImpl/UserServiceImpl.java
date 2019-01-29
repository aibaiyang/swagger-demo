package com.example.demo.serviceImpl;

import com.example.demo.dao.UserRepository;
import com.example.demo.domin.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> queryAllById(Long id) {

        List<User> result = userRepository.queryAllById(id);
        return result;

    }

    @Override
    public List<User> queryAllByName(String name) {

        List<User> result = userRepository.queryByName(name);
        return result;
    }

}
