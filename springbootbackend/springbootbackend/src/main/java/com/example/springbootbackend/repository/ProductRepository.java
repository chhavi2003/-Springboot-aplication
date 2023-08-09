package com.example.springbootbackend.repository;

import com.example.springbootbackend.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Long> {

}
