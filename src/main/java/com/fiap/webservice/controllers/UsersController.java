package com.fiap.webservice.controllers;

import com.fiap.webservice.models.User.User;
import com.fiap.webservice.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/user")
public class UsersController {

    @Autowired
    UsersService usersService;

    @GetMapping("/{userId}")
    public User findUser(@PathVariable String userId) {
        User result = usersService.findUser(userId);
        if(result != null) return result;
        return null;
    }

    @PostMapping("/{userId}")
    public String creatUser(@PathVariable String userId, @RequestBody User user) {
        String result = usersService.creatUser(userId, user);
        return result;
    }

    @PutMapping("/{userId}")
    public String updateUser(@PathVariable String userId, @RequestBody User user) {
        String result = usersService.updateUser(userId,user);
        return result;
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId) {
        String result = usersService.deleteUser(userId);
        return result;
    }

}