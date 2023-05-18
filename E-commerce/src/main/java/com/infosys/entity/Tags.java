package com.infosys.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tags")
public class Tags {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer pk;
	private String name;
	private String friendly_name;
	@ManyToMany(mappedBy = "tags", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Product> product;
	
	public Tags() {
		super();
	}
	
	public Tags(Integer pk, String name, String friendly_name, List<Product> product) {
		super();
		this.pk = pk;
		this.name = name;
		this.friendly_name = friendly_name;
		this.product = product;
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
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	@Override
	public String toString() {
		return "Tags [pk=" + pk + ", name=" + name + ", friendly_name=" + friendly_name + ", product=" + product + "]";
	}

}
