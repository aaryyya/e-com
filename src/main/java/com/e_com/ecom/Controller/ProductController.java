package com.e_com.ecom.Controller;

import com.e_com.ecom.Model.Product;
import com.e_com.ecom.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("product/{id}")
    public Product getProduct(@PathVariable int id){
        return service.getProductById(id);
    }
}
