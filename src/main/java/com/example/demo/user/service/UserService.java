package com.example.demo.user.service;

import com.example.demo.user.entity.UserEntity;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<UserEntity> getAll(Map map);

    void delById(Integer id);

    //保存用户
    public void save(UserEntity userEntity);
}
