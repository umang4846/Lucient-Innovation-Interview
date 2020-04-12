package com.umang.lucientinnovationinterview.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductService productService;
	
	/*@PostMapping("/add")
	public List<Product> addCustomer(@RequestBody List<Product> customerDTO) {
	
				
		return	productService.createOrUpdateCustomer(customerDTO);
			


	}*/
	
	@GetMapping("/list")
	public String listOfEmployee(Model model) {
		List<Product> productList = productService.getAllProducts();
		model.addAttribute("productList", productList);
		return "ProductList";
	}

	

	
	
	
	
}
