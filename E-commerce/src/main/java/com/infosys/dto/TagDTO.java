package com.infosys.dto;

import java.util.List;

import com.infosys.entity.Product;

import jakarta.persistence.ManyToMany;

public class TagDTO {
	
	private int pk;
	private String name;
	private String friendlyName;
	private List<Product> product;
	
	public int getPk() {
		return pk;
	}
	public void setPk(int pk) {
		this.pk = pk;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFriendlyName() {
		return friendlyName;
	}
	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	@Override
	public String toString() {
		return "TagDTO [pk=" + pk + ", name=" + name + ", friendlyName=" + friendlyName + ", product=" + product + "]";
	}

}
