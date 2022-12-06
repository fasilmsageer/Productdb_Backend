package com.nest.Productdb_backend.controller;

import com.nest.Productdb_backend.model.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController



public class ProductController {


    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public String addproduct(@RequestBody Product p){
        System.out.println(p.toString());
        return "Product added Successfully"
    }
}
