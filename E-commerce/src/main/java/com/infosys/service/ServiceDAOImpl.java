package com.infosys.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.infosys.dto.ProductDTO;
import com.infosys.entity.Product;
import com.infosys.repo.ProductRepo;

import jakarta.transaction.Transactional;

@Service(value="ServiceDAO")
@Transactional
public class ServiceDAOImpl implements ServiceDAO {
	
	@Autowired
	private ProductRepo productRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public List<ProductDTO> getProductService() {
		
		List<Product> p = productRepo.findAll();
		
		List<ProductDTO> pl = new ArrayList();
		
		for(Product a: p) {
			
			pl.add(modelMapper.map(a, ProductDTO.class));
			
		}
		
		return pl;
				
	}
	
	

}
