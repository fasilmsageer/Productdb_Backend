package com.nest.Productdb_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")

public class Product {

    @Id
    @GeneratedValue
    private int id;
    private String productcode;
    private String productname;
    private String man_date;
    private String exp_date;


    public Product(){}
}
