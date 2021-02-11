package com.training.spring_demo.service;

import com.training.spring_demo.model.UserEntity;

import java.util.List;

public interface UserService {
    void save(UserEntity userEntity);
    void update(UserEntity userEntity, int id);
    UserEntity getById(int id);
    List<UserEntity> getAllUsers();
    boolean existsById(int id);
    long count();
    UserEntity deleteById(int id);
    UserEntity delete(UserEntity userEntity);
    void deleteAll();

}
