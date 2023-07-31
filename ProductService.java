package com.productdemo;


import java.time.Year;
import java.util.ArrayList;

import java.util.List;

public class ProductService {
	
	List<Product> products = new ArrayList<>();
	
	public void addProduct(Product p) {
		products.add(p);
	}
	
	public List<Product> getAllProducts() {
		return products;
		
	}

	public Product getaProductWithName(String name) {
		for(Product p:products) {
			if(p.getName().equals(name))
				return p;
	
		}
		return null;
	}
	
	

	public List<Product> getProductWithText(String text) {
		
		String str = text.toLowerCase();
		
		List<Product> prods = new ArrayList();
		for(Product p:products) {
			
			String name=p.getName().toLowerCase();
			String type=p.getType().toLowerCase();
			String place=p.getPlace().toLowerCase();
			
			if(name.contains(str)|| type.contains(str) || place.contains(str)) 
				prods.add(p);
				
		}
			return prods;
		
		
		
	}

	public List<Product> getaProductWithType(String text) {
		List<Product> prods = new ArrayList();
		
		String str = text.toLowerCase();
		    for(Product p:products) {
		    	
		    	String type = p.getType().toLowerCase();
		    	
		    	if(type.equals(str))
		    		
		    		prods.add(p);
		    }
		
			
			return prods;
	}

	public List<Product> getProductWithPlace(String text) {
		List<Product> prods = new ArrayList();
		
		String str = text.toLowerCase();
		
		for(Product p:products) {
			String place = p.getPlace().toLowerCase();
			if(place.equals(str))
				prods.add(p);
		}
		return prods;
	}

	public List<Product> getProductWithOutdated(Number num) {
		List<Product> prods = new ArrayList();
		
		for(Product p:products) {
			if(p.getWarranty().equals(num))
				prods.add(p);
		}
		
		return prods;
	}

	public List<Product> getProductWithPrice(Number i) {
		
        List<Product> prods = new ArrayList();
		
		for(Product p:products) {
			if(p.getPrice().equals(i))
				prods.add(p);
		}
		
		return prods;
	}
	

}
