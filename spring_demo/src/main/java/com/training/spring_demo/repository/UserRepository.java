package com.training.spring_demo.repository;

import com.training.spring_demo.model.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
    UserEntity findByFirstName(String firstName);
}
