package com.infosys.dto;

import java.util.List;

import com.infosys.entity.Product;

import jakarta.persistence.ManyToMany;

public class TagsDTO {
	
	private Integer pk;
	private String name;
	private String friendly_name;
	private List<ProductDTO> productDTO;
	
	public TagsDTO() {
		super();
	}

	public TagsDTO(Integer pk, String name, String friendly_name, List<ProductDTO> productDTO) {
		super();
		this.pk = pk;
		this.name = name;
		this.friendly_name = friendly_name;
		this.productDTO = productDTO;
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFriendly_name() {
		return friendly_name;
	}

	public void setFriendly_name(String friendly_name) {
		this.friendly_name = friendly_name;
	}

	public List<ProductDTO> getProductDTO() {
		return productDTO;
	}

	public void setProductDTO(List<ProductDTO> productDTO) {
		this.productDTO = productDTO;
	}

	@Override
	public String toString() {
		return "TagsDTO [pk=" + pk + ", name=" + name + ", friendly_name=" + friendly_name + ", productDTO="
				+ productDTO + "]";
	}

}
