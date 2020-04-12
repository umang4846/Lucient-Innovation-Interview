package com.umang.lucientinnovationinterview.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	public List<Product> createOrUpdateCustomer(List<Product> product) {
		return productRepository.saveAll(product);
	}

	public List<Product> getAllProducts() {

		return productRepository.findAll();

	}
	
}

