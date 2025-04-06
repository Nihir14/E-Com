package com.nihir.e_com_pro.controller;

import com.nihir.e_com_pro.model.Product;
import com.nihir.e_com_pro.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {
    // Add your methods and logic here for handling product-related requests
    // For example, you can create methods for adding, updating, deleting, and retrieving products
    // You can also implement methods for searching and filtering products based on various criteria
    // Make sure to use appropriate annotations like @GetMapping, @PostMapping, etc. for your endpoints

    // Example method to get all products
    // @GetMapping("/products")
    // public List<Product> getAllProducts() {
    //     return productService.getAllProducts();
    // }

    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String string() {
        return "Welcome to E-Commerce Application";
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        // Implement logic to retrieve all products from the database
        return new ResponseEntity<>(service.getAllProducts(),HttpStatus.OK); // Replace with actual product retrieval logic
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {
        // Implement logic to retrieve a product by its ID from the database
        return new ResponseEntity<>(service.getProductById(id), HttpStatus.OK); // Replace with actual product retrieval logic
    }

    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@RequestPart Product prod,
                                        @RequestPart MultipartFile imageFile) {
        try {
            Product product = service.addProduct(prod, imageFile);
            return new ResponseEntity<>(product, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
