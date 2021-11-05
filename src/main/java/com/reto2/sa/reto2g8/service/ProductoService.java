/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto2.sa.reto2g8.service;

import com.reto2.sa.reto2g8.entity.Producto;
import com.reto2.sa.reto2g8.entity.User;
import com.reto2.sa.reto2g8.repository.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DELL
 */
@Service
public class ProductoService {
    
    @Autowired
    private ProductoRepository repository;
    
    public List<Producto> getProductos(){
        return repository.findAll();
    }
    
    public Producto saveProducto(Producto producto){
        return repository.save(producto);
    }
    
       
    public List<Producto> categoria(String categoria){
       return repository.getCategoria(categoria);
    }
    
}
