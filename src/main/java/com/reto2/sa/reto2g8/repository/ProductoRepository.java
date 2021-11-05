/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto2.sa.reto2g8.repository;

import com.reto2.sa.reto2g8.entity.Producto;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author DELL
 */
public interface ProductoRepository extends MongoRepository<Producto,String>{
      @Query("{categoria:?0}")                                        
      List<Producto> getCategoria(String categoria);
}
