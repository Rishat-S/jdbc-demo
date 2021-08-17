package com.example.jdbcdemo.service;

import com.example.jdbcdemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public String getProductName(String name) {
        return customerRepository.getProductName(name);
    }
}
