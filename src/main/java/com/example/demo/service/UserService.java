package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void create(User user){
        userRepository.save(user);
    }

    public void update(User user) {
        userRepository.save(user);
    }

    public User findByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    public User findById(Long id) {
        return userRepository.findUserById(id);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public void delete(User user) {
        userRepository.delete(user);
    }
}
