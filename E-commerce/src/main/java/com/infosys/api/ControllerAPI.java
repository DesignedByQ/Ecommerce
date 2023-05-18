package com.infosys.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.dto.ProductDTO;
import com.infosys.dto.TagsDTO;
import com.infosys.entity.Product;
import com.infosys.service.ServiceDAOImpl;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
@Validated
public class ControllerAPI {
	
	@Autowired
	private ServiceDAOImpl serviceDAOImpl;
	
	@PostMapping(value = "/addproduct", consumes = {MediaType.ALL_VALUE})
	public ResponseEntity<ProductDTO> addProduct(@Valid @RequestBody ProductDTO productDTO){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(serviceDAOImpl.addProductService(productDTO));
	}
	
	@GetMapping(value = "/getproducts", consumes = {MediaType.ALL_VALUE}, produces = {"application/json", "application/xml"})
	public ResponseEntity<List<ProductDTO>> getProducts(){
		
		return ResponseEntity.status(HttpStatus.OK).body(serviceDAOImpl.getProductsService());
		
	}
	
	@PostMapping(value = "/addtag", consumes = {MediaType.ALL_VALUE})
	public ResponseEntity<TagsDTO> addTag(@Valid @RequestBody TagsDTO tagDTO){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(serviceDAOImpl.addTagService(tagDTO));
	}
	
	@GetMapping(value = "/gettags", consumes = {MediaType.ALL_VALUE}, produces = {"application/json", "application/xml"})
	public ResponseEntity<List<TagsDTO>> getTags(){
		
		return ResponseEntity.status(HttpStatus.OK).body(serviceDAOImpl.getTagsService());
	}

}
