package com.example.caotruongtoan_2011063795.services;

import com.example.caotruongtoan_2011063795.entity.User;
import com.example.caotruongtoan_2011063795.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import  com.example.caotruongtoan_2011063795.repository.IRoleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
@Slf4j
public class UserService {
    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IRoleRepository roleRepository;

    public void save (User user){
        userRepository.save(user);
        Long userId = userRepository.getUserIdByname(user.getUsername());
        Long roleId = roleRepository.getRoleIdByName("USER");
        if(roleId != 0 && userId !=0){
            userRepository.addRoleToUser(userId, roleId);
        }
    }
}