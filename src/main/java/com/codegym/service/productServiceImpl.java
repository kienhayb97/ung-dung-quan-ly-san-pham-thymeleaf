package com.codegym.service;

import com.codegym.model.product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class productServiceImpl implements productService {
    private static Map<Integer, product> products;

    static {
        products = new HashMap<>();
        products.put(1, new product(1, "tao", 3, "do"));
        products.put(2, new product(2, "sung", 4, "xanh"));
        products.put(3, new product(3, "ca", 4, "tim"));
        products.put(4, new product(4, "kim", 5, "hong"));
    }

    @Override
    public List<product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(product product) {
        products.put(product.getId(), product);
    }

    @Override
    public product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
