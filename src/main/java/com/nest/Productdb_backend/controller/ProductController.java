package com.nest.Productdb_backend.controller;

import com.nest.Productdb_backend.dao.ProductDao;
import com.nest.Productdb_backend.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController



public class ProductController {

    @Autowired
    private ProductDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addproduct", consumes = "application/json", produces = "application/json")
    public String addproduct(@RequestBody Product p){
        System.out.println(p.getProductcode().toString());
        System.out.println(p.getProductname().toString());
        System.out.println(p.getMan_date().toString());
        System.out.println(p.getExp_date().toString());

        dao.save(p);
        return "Product added Successfully";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewproduct")
    public List<Product>viewAll(){
        return (List<Product>) dao.findAll();
    }
}
