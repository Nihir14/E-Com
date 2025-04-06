package com.nihir.e_com_pro.repo;

import com.nihir.e_com_pro.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    // You can define custom query methods here if needed
    // For example:
    // List<Product> findByCategory(String category);
    // List<Product> findByBrand(String brand);
    // List<Product> findByPriceBetween(double minPrice, double maxPrice);

}
