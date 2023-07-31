package com.productdemo;

public class Product {
	private String name;
	private String type;
	private String place;
	private Number warranty;
	private Number price;

	public Product(){
		
	}

	public Product(String name, String type, String place, Number warranty, Number price) {
		this.name = name;
		this.type = type;
		this.place = place;
		this.warranty = warranty;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Number getWarranty() {
		return warranty;
	}

	public void setWarranty(Number warranty) {
		this.warranty = warranty;
	}

	public Number getPrice() {
		return price;
	}

	public void setPrice(Number price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", type=" + type + ", place=" + place + ", warranty=" + warranty + ", price="
				+ price + "]";
	}
	
	
	
	
	

}
