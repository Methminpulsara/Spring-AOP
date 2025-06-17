package edu.icet.ecom.controller;

import edu.icet.ecom.anotation.LogExecutionTime;
import edu.icet.ecom.model.Product;
import edu.icet.ecom.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j// --> for log
@RestController()
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    //meeka ConCreet reference ekk nisa thma api lombokge ena SLf4j Anotation ek dhanne ekh dhna hinda meka oone nh
    //--> login Framework
    //private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ProductController.class);

    //product controller kiyla nama dhanne nh mokd ProductController eken create wenne Product ekk withryi

    private final ProductService service;

    @GetMapping()
    @LogExecutionTime
    List<Product> get(String name){
        List<Product> product = service.getProduct();
        return product;
    }




}
