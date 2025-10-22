package com.e_com.ecom.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
@Entity
@Data//for lombok and inbuilt methods for getter setter of the here, product class
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;
//    @JsonFormat(shape=JsonFormat.Shape.STRING,pattern="dd-MM-yy")//this commented as it was handled in changed ui ecom-3
    private Date releaseDate;
    private boolean productAvailable;//changed to prodAvi from available for changes in frontend error solving
    private int stockQuantity;//changed from quantity to <-
//what things do image poses:
//    1name 2type 3data
// forms of image not all types of images r supported
    private String imageName;
    private String imageType;
    @Lob//by persistence
    private byte[] imageData;//store in large object format if u want to store in the format of byte array

//    public void setImageDate(byte[] bytes) {
//    }
    // we are storing in byte array coz we r storing it in our db and not on cloud as we will need to signup n stuff
    // it isnt ideal but is for learning purpose only(storage in db)
//    we can also include url for image data



}
