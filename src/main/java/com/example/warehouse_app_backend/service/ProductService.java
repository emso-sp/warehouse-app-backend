package com.example.warehouse_app_backend.service;
// Service Layer implements business logic and data transformations
// acts as a mediator between the web interface and data resources

import com.example.warehouse_app_backend.model.ProductDTO;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<ProductDTO> getAllProducts();
    Optional<ProductDTO> getProductById(Long id);
    ProductDTO saveProduct(ProductDTO productDTO);
    ProductDTO updateProduct(Long id, ProductDTO productDTO);
    void deleteProduct(Long id);
}