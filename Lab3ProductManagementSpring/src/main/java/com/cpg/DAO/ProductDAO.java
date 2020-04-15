package com.cpg.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cpg.DTO.ProductDTO;

public interface ProductDAO extends JpaRepository<ProductDTO, Integer> {

}
