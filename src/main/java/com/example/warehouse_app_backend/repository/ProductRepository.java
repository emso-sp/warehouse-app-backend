package com.example.warehouse_app_backend.repository;

// JpaRepository: provides all the necessary CRUD methods like save(), findAll(), findById() and deleteById()
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.warehouse_app_backend.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}