package com.e_com.ecom.Controller;

import com.e_com.ecom.Model.Product;
import com.e_com.ecom.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService service;
    @RequestMapping("/")
    public String greet(){
        return "Heloo People";//push
    }
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();

    }
}
