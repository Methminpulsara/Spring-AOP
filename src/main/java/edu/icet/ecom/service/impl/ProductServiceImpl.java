package edu.icet.ecom.service.impl;

import edu.icet.ecom.model.Product;
import edu.icet.ecom.service.ProductService;

import java.util.Arrays;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    @Override
    public List<Product> getProduct() {
        return Arrays.asList(
                new Product("orange", "best one ", 200.00),
                new Product("mango", "best one ", 200.00),
                new Product("lemon", "best one ", 500.00)
        );
    }
}
