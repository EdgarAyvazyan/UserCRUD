package com.training.spring_demo.service;

import com.training.spring_demo.model.UserEntity;
import com.training.spring_demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void save(UserEntity userEntity) {
        userRepository.save(userEntity);
    }
    @Override
    public void update(UserEntity userEntity, int id) {
        userEntity.setId(id);
        userRepository.save(userEntity);
    }
    @Override
    public UserEntity getById(int id) {
        return userRepository.findById(id).orElse(null);
    }
    @Override
    public List<UserEntity> getAllUsers() {
        return (List<UserEntity>) userRepository.findAll();
    }
    @Override
    public boolean existsById(int id){
        return userRepository.existsById(id);
    }
    @Override
    public long count() {
       return userRepository.count();
    }
    @Override
    public UserEntity deleteById(int id) {
        UserEntity userEntity = getById(id);
        if (userEntity != null) {
            userRepository.delete(userEntity);
        }

        return userEntity;
    }
    @Override
    public UserEntity delete(UserEntity userEntity) {
        if (userEntity != null) {
            userRepository.delete(userEntity);
        }

        return userEntity;
    }
    @Override
    public void deleteAll() {
        userRepository.deleteAll();
    }
}
