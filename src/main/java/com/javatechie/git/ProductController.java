package com.javatechie.git;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@PostMapping("/product/{productName}/{productId}/{productPrice}")
	public String addProduct(@PathVariable("productName")String productName,@PathVariable("productId")int productId,
			@PathVariable("productPrice")int productPrice) {
		return "product with name"+productName+" with id "+productId+" with price "+productPrice+" placed";
	}
}
