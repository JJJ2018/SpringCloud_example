package org.example.controller;

import org.example.common.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    ProductFeign productFeign;

    @GetMapping("/{id}")
    public Product buy(@PathVariable Long id) {
        Product product = productFeign.findById(id);
        return product;
    }
}
