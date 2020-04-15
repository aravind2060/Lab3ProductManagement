package com.cpg.Controllers;

import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpg.DTO.ProductDTO;
import com.cpg.service.ProductService;

//todo add cross origin

@RestController
public class ProductController {
 
	
	@Autowired
	ProductService service;
	 
	@RequestMapping(value = {"/viewproducts"},produces = {"application/json","application/xml"})
	public List<ProductDTO> viewAllProducts()
	{
	  return service.viewAllProducts();	
	}
	
	@RequestMapping(value= {"/addProduct"})
	public void addProduct(ProductDTO product,HttpServletRequest request)
	{
		System.out.println(product);
		System.out.println(request.getAttributeNames());
		service.addProduct(product);
	}
	
}
