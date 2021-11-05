/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto2.sa.reto2g8.controller;

import com.reto2.sa.reto2g8.entity.Producto;
import com.reto2.sa.reto2g8.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DELL
 */
@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/api/Producto/")  
public class ProductoController {
    
    @Autowired
    private ProductoService service;
    
    @GetMapping("/all")    
    public List<Producto> findAllProducto(){
        return service.getProductos();
    }
    
    @GetMapping("{categoria}")    
    public List<Producto> findAllCategoriaProducto(@PathVariable
            String categoria){
        System.out.println(categoria);
        return service.categoria(categoria);
    }  
    
    
    @PostMapping("/save")
    public ResponseEntity addProducto(@RequestBody Producto producto){
        service.saveProducto(producto);
        return ResponseEntity.status(201).build();
    }
       
    
}
