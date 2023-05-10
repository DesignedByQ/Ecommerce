package com.infosys.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.dto.ProductDTO;
import com.infosys.entity.Product;
import com.infosys.service.ServiceDAOImpl;





@RestController
@RequestMapping("/api")
@Validated
public class ControllerAPI {
	
	@Autowired
	private ServiceDAOImpl serviceDAOImpl;
	
	@GetMapping(value = "/products", consumes = {MediaType.ALL_VALUE}, produces = {"application/json", "application/xml"})
	public ResponseEntity<List<ProductDTO>> getProducts(){
		
		return ResponseEntity.status(HttpStatus.OK).body(serviceDAOImpl.getProductService());
		
	}
	

}
