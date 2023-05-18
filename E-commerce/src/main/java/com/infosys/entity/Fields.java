package com.infosys.entity;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="fields")
public class Fields{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pk")
	private Integer pk;
	private String sku;
	private String name;
	private String description;
	private boolean has_sizes;
	private Integer inventory_count;
	private double retail_price;
	@Lob
	private byte[] image;
	private String image_url;
	private float rating;
	@OneToOne(mappedBy = "fields")
	private Product product;
	
	public Fields() {
		super();
	}
	
	public Fields(Integer pk, String sku, String name, String description, boolean has_sizes, Integer inventory_count,
			double retail_price, byte[] image, String image_url, float rating, Product product) {
		super();
		this.pk = pk;
		this.sku = sku;
		this.name = name;
		this.description = description;
		this.has_sizes = has_sizes;
		this.inventory_count = inventory_count;
		this.retail_price = retail_price;
		this.image = image;
		this.image_url = image_url;
		this.rating = rating;
		this.product = product;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean ishas_sizes() {
		return has_sizes;
	}
	public void sethas_sizes(boolean has_sizes) {
		this.has_sizes = has_sizes;
	}
	public Integer getinventory_count() {
		return inventory_count;
	}
	public void setinventory_count(Integer inventory_count) {
		this.inventory_count = inventory_count;
	}
	public double getretail_price() {
		return retail_price;
	}
	public void setretail_price(double retail_price) {
		this.retail_price = retail_price;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public String getimage_url() {
		return image_url;
	}
	public void setimage_url(String image_url) {
		this.image_url = image_url;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Fields [sku=" + sku + ", name=" + name + ", description=" + description + ", has_sizes=" + has_sizes
				+ ", inventory_count=" + inventory_count + ", retail_price=" + retail_price + ", image="
				+ Arrays.toString(image) + ", image_url=" + image_url + ", rating=" + rating + "]";
	}
	
}
