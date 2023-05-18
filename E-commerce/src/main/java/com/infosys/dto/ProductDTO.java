package com.infosys.dto;

import java.util.Arrays;
import java.util.List;

import jakarta.persistence.ManyToMany;

public class ProductDTO {
	
	private Integer pk;
    private String model;
    private Fields fields;
    private List<TagsDTO> tags;
    
	public ProductDTO() {
		super();
	}

	public ProductDTO(Integer pk, String model, Fields fields, List<TagsDTO> tags) {
		super();
		this.pk = pk;
		this.model = model;
		this.fields = fields;
		this.tags = tags;
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Fields getFields() {
		return fields;
	}

	public void setFields(Fields fields) {
		this.fields = fields;
	}

	public List<TagsDTO> getTags() {
		return tags;
	}

	public void setTags(List<TagsDTO> tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "ProductDTO [pk=" + pk + ", model=" + model + ", fields=" + fields + ", tags=" + tags + "]";
	}
      
}