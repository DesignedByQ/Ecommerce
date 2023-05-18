package com.infosys.dto;

import java.util.Arrays;

public class Fields{
	
	private String sku;
	private String name;
	private String description;
	private boolean has_sizes;
	private Integer inventory_count;
	private double retail_price;
	private byte[] image;
	private String image_url;
	private float rating;
	
	public Fields() {
		super();
	}

	public Fields(String sku, String name, String description, boolean has_sizes, Integer inventory_count,
			double retail_price, byte[] image, String image_url, float rating) {
		super();
		this.sku = sku;
		this.name = name;
		this.description = description;
		this.has_sizes = has_sizes;
		this.inventory_count = inventory_count;
		this.retail_price = retail_price;
		this.image = image;
		this.image_url = image_url;
		this.rating = rating;
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

	public boolean isHas_sizes() {
		return has_sizes;
	}

	public void setHas_sizes(boolean has_sizes) {
		this.has_sizes = has_sizes;
	}

	public Integer getInventory_count() {
		return inventory_count;
	}

	public void setInventory_count(Integer inventory_count) {
		this.inventory_count = inventory_count;
	}

	public double getRetail_price() {
		return retail_price;
	}

	public void setRetail_price(double retail_price) {
		this.retail_price = retail_price;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
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
		return "Fields [sku=" + sku + ", name=" + name + ", description=" + description + ", has_sizes="
				+ has_sizes + ", inventory_count=" + inventory_count + ", retail_price=" + retail_price + ", image="
				+ Arrays.toString(image) + ", image_url=" + image_url + ", rating=" + rating + "]";
	}
	
}
