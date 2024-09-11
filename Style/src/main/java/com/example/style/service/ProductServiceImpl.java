package com.example.style.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.style.entity.Product;
import com.example.style.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	  @Autowired
	    private ProductRepository productRepository;

	    @Override
	    public List<Product> getAllProducts() {
	        return productRepository.findAll();
	    }
}