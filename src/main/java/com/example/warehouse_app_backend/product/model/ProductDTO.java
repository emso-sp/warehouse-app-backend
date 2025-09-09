package com.example.warehouse_app_backend.product.model;

// Java record: A Java feature that automatically generates constructors, getters, toString(), equals() and hashCode()
    // makes it ideal for use as a DTO to transfer data between the server and client
    
public record ProductDTO(Long id, String name, int quantity, double price) {}