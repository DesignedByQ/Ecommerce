package com.infosys.entity;

import java.util.List;

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
	private String friendlyName;
	@ManyToMany
	private List<Product> product;
	
	public int getPk() {
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
		return "Tags [pk=" + pk + ", name=" + name + ", friendlyName=" + friendlyName + ", product=" + product + "]";
	}

}
