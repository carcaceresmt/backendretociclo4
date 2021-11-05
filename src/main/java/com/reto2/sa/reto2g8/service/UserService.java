/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto2.sa.reto2g8.service;

import com.reto2.sa.reto2g8.entity.User;
import com.reto2.sa.reto2g8.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DELL
 */
@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;
    
    public List<User> getUsers(){
        return repository.findAll();
    }
    
    public User saveUser(User user){
        return repository.save(user);
    }
 
    
    
}
