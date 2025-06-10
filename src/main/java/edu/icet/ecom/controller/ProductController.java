package edu.icet.ecom.controller;

import edu.icet.ecom.model.Product;
import lombok.NonNull;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/products")
public class ProductController {

    //product controller kiyla nama dhanne nh mokd ProductController eken create wenne Product ekk withryi

    @PostMapping()
    void create( Product product){
        System.out.println(product);
    }

}
