package com.e_com.ecom.Service;

import com.e_com.ecom.Model.Product;
import com.e_com.ecom.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo repo;
    public List<Product> getAllProducts() {
        return repo.findAll();

    }
    public Product getProductById(int id){
        return repo.findById(id).orElse(null);//use if using with response entity
//        return repo.findById(id).get();//use if doing without response entity
    }
}
