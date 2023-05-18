package com.infosys.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.entity.Tags;
import com.infosys.dto.ProductDTO;
import com.infosys.dto.TagsDTO;
import com.infosys.entity.Product;
import com.infosys.repo.ProductRepo;
import com.infosys.repo.TagsRepo;

import jakarta.transaction.Transactional;

@Service(value="ServiceDAO")
@Transactional
public class ServiceDAOImpl implements ServiceDAO {
	
	@Autowired
	private ProductRepo productRepo;
	
	@Autowired
	private TagsRepo tagsRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public List<ProductDTO> getProductsService() {
		
		List<Product> p = productRepo.findAll();
		
		List<ProductDTO> pl = new ArrayList();
		
		for(Product a: p) {
			
			pl.add(modelMapper.map(a, ProductDTO.class));
			
		}
		
		return pl;
				
	}

	@Override
	public ProductDTO addProductService(ProductDTO productDTO) {

		Product p = productRepo.saveAndFlush(modelMapper.map(productDTO, Product.class));
		
		return modelMapper.map(p, ProductDTO.class);
	}

	@Override
	public List<TagsDTO> getTagsService() {

		List<Tags> tl = tagsRepo.findAll();
		
		List<TagsDTO> tdtol = new ArrayList();
		
		for(Tags a: tl) {
			
			tdtol.add(modelMapper.map(a, TagsDTO.class));			
			
		}
		
		return tdtol;
		
	}
	
	@Override
	public TagsDTO addTagService(TagsDTO tagsDTO) {

		Tags t = tagsRepo.saveAndFlush(modelMapper.map(tagsDTO, Tags.class));
		
		return modelMapper.map(t, TagsDTO.class);
	}

}
