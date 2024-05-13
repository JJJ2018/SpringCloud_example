package org.example.controller;

import org.example.common.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "product-service")
public interface ProductFeign {
    @GetMapping(value = "/product/{id}")
    Product findById(@PathVariable Long id);
}
