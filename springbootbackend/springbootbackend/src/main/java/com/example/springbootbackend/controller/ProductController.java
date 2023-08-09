package com.example.springbootbackend.controller;

import com.example.springbootbackend.entity.Products;
import com.example.springbootbackend.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:8081/")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public List<Products> fetchProducts() {
        return productRepository.findAll();
    }

}