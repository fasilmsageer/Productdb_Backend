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

    public Product(int id, String productcode, String productname, String man_date, String exp_date) {
        this.id = id;
        this.productcode = productcode;
        this.productname = productname;
        this.man_date = man_date;
        this.exp_date = exp_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getMan_date() {
        return man_date;
    }

    public void setMan_date(String man_date) {
        this.man_date = man_date;
    }

    public String getExp_date() {
        return exp_date;
    }

    public void setExp_date(String exp_date) {
        this.exp_date = exp_date;
    }
}
