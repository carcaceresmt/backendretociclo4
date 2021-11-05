/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto2.sa.reto2g8.repository;

import com.reto2.sa.reto2g8.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author DELL
 */
public interface UserRepository extends MongoRepository<User,String>{
    
}
