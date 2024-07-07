package com.example.jpa_basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public String addUser(User user){
        userRepository.save(user);
        return "User added";

    }
    public List<User> getUsers(){
        return userRepository.findAll();
    }
    public User getUser(int id){
        return userRepository.findById(id).get();
    }
    public String deleteUsers(){
        userRepository.deleteAll();
        return "all user delete successfully";
    }
    public String deleteUser(int id){
         userRepository.deleteById(id);
         return "User delete successfully by id";
    }
    public void updateUserName(int id, String name) {
        userRepository.findById(id).get().setName(name);
    }

    }

