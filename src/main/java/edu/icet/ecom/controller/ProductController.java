package edu.icet.ecom.controller;

import edu.icet.ecom.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j // --> for log
@RestController()
@RequestMapping("/products")
public class ProductController {


    //meeka ConCreet reference ekk nisa thma api lombokge ena SLf4j Anotation ek dhanne ekh dhna hinda meka oone nh
    //--> login Framework
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ProductController.class);


    //product controller kiyla nama dhanne nh mokd ProductController eken create wenne Product ekk withryi

    @PostMapping()
    void create( Product product){
        log.info("Request Received {}", product);
    }

}
