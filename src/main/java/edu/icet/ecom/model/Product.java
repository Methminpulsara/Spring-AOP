package edu.icet.ecom.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {

    private String name;
    private String description;
    private Double price;

}
