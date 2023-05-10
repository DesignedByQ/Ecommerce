package com.infosys.entity;

import java.util.Arrays;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="product")

public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//using identity starts from 1 and auto increments
	private Integer pk;
	private String sku;
	private String name;
	@ManyToMany
	private List<Tags> tags;
	private String description;
	private boolean hasSizes;
	private Integer inventoryCount;
	private double retailPrice;
	private byte[] image;
	private String imageUrl;
	private float rating;
	
	public Integer getPk() {
		return pk;
	}
	public void setPk(Integer pk) {
		this.pk = pk;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Tags> getTags() {
		return tags;
	}
	public void setTags(List<Tags> tags) {
		this.tags = tags;
	}	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isHasSizes() {
		return hasSizes;
	}
	public void setHasSizes(boolean hasSizes) {
		this.hasSizes = hasSizes;
	}
	public int getInventoryCount() {
		return inventoryCount;
	}
	public void setInventoryCount(Integer inventoryCount) {
		this.inventoryCount = inventoryCount;
	}
	public double getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Product [pk=" + pk + ", sku=" + sku + ", name=" + name + ", tags=" + tags + ", description="
				+ description + ", hasSizes=" + hasSizes + ", inventoryCount=" + inventoryCount + ", retailPrice="
				+ retailPrice + ", image=" + Arrays.toString(image) + ", imageUrl=" + imageUrl + ", rating=" + rating
				+ "]";
	}

}
