package com.cpg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cpg.DAO.ProductDAO;
import com.cpg.DTO.ProductDTO;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDao;
	
	@Override
	public void addProduct(ProductDTO product) {
	    if(product!=null)  
 	      productDao.save(product);
	    //TODO set exception
	}

	@Override
	public List<ProductDTO> viewAllProducts() {
		
		return productDao.findAll();
	}

}
