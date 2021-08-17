package com.example.jdbcdemo.controller;

import com.example.jdbcdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class CustomerRestController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/fetch-product")
    public String getProductByName(@RequestParam("name") String name) {
        return customerService.getProductByName(name);
    }
}
