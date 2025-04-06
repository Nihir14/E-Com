package com.nihir.e_com_pro.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;

    private String imageName;
    private String imagetype;
    @Lob
    private byte[] imageData;

    private double price;
    private int quantity;
    private String category;
    private String brand;
    private String color;
    private String size;
    private String material;
    private String warranty;
    private String careInstructions;
    private String returnPolicy;
    private String shippingDetails;
    private String customerReviews;
    private String ratings;
    private String availability;
    private String discount;
    private String tags;
    private String specifications;
    private String additionalInfo;
    private String relatedProducts;
    private String sellerInfo;

}
