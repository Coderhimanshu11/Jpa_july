package com.example.jpa_basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/add")
    public String addUser(@RequestBody User user){
return userService.addUser(user);
    }
@GetMapping("/getUsers")
    public List<User> getAllUsers(){
      return userService.getUsers();
}
@GetMapping("/getUser")
    public User getUser(@RequestParam("id")int id){
        return userService.getUser(id);

}@DeleteMapping("/deleteUsers")
    public String deleteUsers(){
        return userService.deleteUsers();

    }
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable("id")int id){
       return userService.deleteUser(id);
    }


    @PutMapping("/updateUserName")
    public String updateUserName(@RequestParam int id, @RequestParam String name) {
         userService.updateUserName(id,name);
         return "user updated successfully";
    }
//delete all the users
    // delete a user by userid
    //update the name of a user with a particular userid


}
