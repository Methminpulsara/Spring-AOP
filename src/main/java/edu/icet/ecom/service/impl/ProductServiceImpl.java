package edu.icet.ecom.service.impl;

import edu.icet.ecom.anotation.LogExecutionTime;
import edu.icet.ecom.model.Product;
import edu.icet.ecom.service.ProductService;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    @LogExecutionTime
    public List<Product> getProduct() {
        return Arrays.asList(
                new Product("orange", "best one ", 200.00),
                new Product("mango", "best one ", 200.00),
                new Product("lemon", "best one ", 500.00)
        );
    }
}
