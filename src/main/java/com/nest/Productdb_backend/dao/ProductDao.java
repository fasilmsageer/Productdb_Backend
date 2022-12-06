package com.nest.Productdb_backend.dao;

import com.nest.Productdb_backend.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product,Integer> {
}
