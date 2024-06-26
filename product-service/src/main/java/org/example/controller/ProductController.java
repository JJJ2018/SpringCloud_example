package org.example.controller;

import org.example.common.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    @GetMapping("/{id}")
    public Product findById(@PathVariable Long id) {
        Product product = new Product();
        product.setId(id);
        product.setName("product test");
        return product;
    }
}

