package com.e_com.ecom.Controller;

import com.e_com.ecom.Model.Product;
import com.e_com.ecom.Service.ProductService;
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
    @Autowired
    private ProductService service;
    @RequestMapping("/")
    public String greet(){
        return "Heloo People";//push
    }
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts(){
        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);

    }
    @GetMapping("product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id){
        Product product =service.getProductById(id);
        if(product!=null) return new ResponseEntity<>(product,HttpStatus.OK);
        else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        return service.getProductById(id);//
    }

    @PostMapping("/product")//just product coz we r sending data in the body
    public ResponseEntity<?>addProduct(@RequestPart Product product,
                                       @RequestPart MultipartFile imageFile){//for just normal product without an image it is easy as we just use request body
        //?represents that it can either return data or an exception
        //request body accepts the whole object or the whole json as object
        //request part accepts in the parts
        try {
            Product product1 = service.addProduct(product, imageFile);
            return new ResponseEntity<>(product1,HttpStatus.CREATED);
        }
        catch(Exception e){
            return new ResponseEntity<>(e.getMesssage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
