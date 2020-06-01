package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {


    private UserService userService;

    public UserController(UserService userService){
        this.userService=userService;
    }



    @PostMapping
    public ResponseEntity addNewUser(@RequestBody User user) {
        userService.create(user);
        return ResponseEntity.ok().build();
    }



    @PutMapping
    public ResponseEntity updateUser(@RequestBody User user) {
        userService.update(user);
        return ResponseEntity.ok().build();
    }



    @DeleteMapping
    public ResponseEntity deleteUser(@RequestBody User user) {
        userService.delete(user);
        return ResponseEntity.ok().build();
    }



    @GetMapping("userEmail")
    public @ResponseBody User findUserByEmail(@RequestParam(value = "email") String email) {
        return userService.findByEmail(email);
    }


    @GetMapping("userId")
    public @ResponseBody User findUserByEmail(@RequestParam(value = "id") Long id) {
        return userService.findById(id);
    }


    @GetMapping
    public @ResponseBody List<User> findAllUsers() {

      return userService.findAll();


    }


}
