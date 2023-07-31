package com.productdemo;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
	
		ProductService service = new ProductService();
		
      
		service.addProduct(new Product("Asus Macbook","Laptop","Brown Table",2020,10000));
		service.addProduct(new Product("Dell Latitude 5280","Laptop","white Table",2021,20000));
		service.addProduct(new Product("Mac Studio","Computer","white Table",2019,60000));
		service.addProduct(new Product("Type C","Cable","Black Drawer",2024,600));
		service.addProduct(new Product("Focusrite Mixer","Audio System","white Table",2023,2000));
		service.addProduct(new Product("Boat Blutooth","Earphones","Cupboard",2020,1100));
		service.addProduct(new Product("Asus Rog","Loptop","Black Table",2021,65000));
		service.addProduct(new Product("Macbook Pro","Laptop","Brown Drawer",2022,50000));
		service.addProduct(new Product("Wacom Pad","Writing Pad","Black Drawer",2020,5000));
		service.addProduct(new Product("Apple Keyboard","Keyboard","white Table",2022,3000));
		service.addProduct(new Product("Logitech keyboard","Keyboard","Black Table",2024,6000));
		service.addProduct(new Product("Hdmi Cable","Cable","Black Drawer",2024,2000));
		service.addProduct(new Product("Java Black Book","Cable","Shelf",2023,6000));
		service.addProduct(new Product("Logi Mouse","Mouse","Black Table",2022,600));
		service.addProduct(new Product("Dell Mouse","Mouse","Brown Table",2018,4000));
		service.addProduct(new Product("Lenovo Mouse","Mouse","Black Drawer",2022,2000));
		service.addProduct(new Product("BlackBeast","Computer","White Table",2020,70000));
		
		
		List<Product> products = service.getAllProducts();
		
		for(Product p:products) {
			System.out.println(p);
		}
		
		Product pname = service.getaProductWithName("Mac Studio");
		System.out.println(pname);
		
		List<Product> prodstext = service.getProductWithText("drawer");
		
				for(Product pro:prodstext) {
				  //System.out.println(pro);
				}
				
		
	     List<Product> prodst = service.getaProductWithType("Mouse");
		
		for(Product pt:prodst)
	       System.out.println(pt);
		
		List<Product> prodsp = service.getProductWithPlace("white table");
		
		for(Product pp:prodsp) {
			System.out.println(pp);
		}
		
		List<Product> prodsout= service.getProductWithOutdated(2024);
		
		for(Product po:prodsout) {
			System.out.println(po);
		}
		
          List<Product> prodsprice= service.getProductWithPrice(2000);
		
		  for(Product pp1:prodsprice) {
			System.out.println(pp1);
		  }
		
		
		
	
	}
	
}
