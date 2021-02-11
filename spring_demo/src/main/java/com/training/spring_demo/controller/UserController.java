package com.training.spring_demo.controller;

import com.training.spring_demo.model.UserEntity;
import com.training.spring_demo.service.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserServiceImpl userServiceImpl;

    public UserController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @PutMapping
    public void save(@RequestBody UserEntity userEntity) {

        userServiceImpl.save(userEntity);
    }

    @PostMapping
    public void update(@RequestBody UserEntity userEntity, @PathVariable int id){
        userServiceImpl.update(userEntity,id);
    }

    @GetMapping(path = "/{id}")
    public UserEntity getById(@PathVariable int id) {
        return userServiceImpl.getById(id);
    }

    @GetMapping
    public List<UserEntity> getAllUsers() {
        return userServiceImpl.getAllUsers();
    }

    @DeleteMapping(path = "/{id}")
    public UserEntity deleteById(@PathVariable int id) {
        return userServiceImpl.deleteById(id);
    }

    @DeleteMapping
    public UserEntity delete (@RequestBody UserEntity userEntity){
        return userServiceImpl.delete(userEntity);
    }

    @RequestMapping(value = "/deleteAll",method = RequestMethod.DELETE)
    public void deleteAll() {
        userServiceImpl.deleteAll();
    }


}
