package com.codegym.service;

import com.codegym.model.product;

import java.util.List;

public interface productService {
    List<product>findAll();
    void save(product product);
    product findById(int id);
    void update(int id,product product);
    void remove(int id);
}
