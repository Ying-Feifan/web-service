package com.fiap.webservice.services;

import com.fiap.webservice.models.User.User;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    public User findUser(String id){
        return userMock();
    }
    public String creatUser(String id, User user){
        return "created";
    }
    public String updateUser(String id, User user){
        return "updated";
    }
    public String deleteUser(String id){
        return "deleted";
    }

    private User userMock(){
        User user = new User();
        user.setId("01");
        user.setName("userTest");
        return user;
    }
}
