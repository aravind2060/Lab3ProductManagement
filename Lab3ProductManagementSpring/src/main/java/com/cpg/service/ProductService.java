package com.cpg.service;

import java.util.List;

import com.cpg.DTO.ProductDTO;

public interface ProductService {

	public void addProduct(ProductDTO product);
	
	public List<ProductDTO> viewAllProducts();
}
