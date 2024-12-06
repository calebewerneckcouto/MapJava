package application;

import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class Demo {
	
	
	public static void main(String[]args) {
		
		
		Map<Product,Double> cookies = new HashMap<>();
		
		
		Product p1 = new Product("TV",900.00);
		Product p2 = new Product("Notebook",1200.00);
		Product p3 = new Product("Tablet",400.00);
		
		cookies.put(p1,10000.0);
		cookies.put(p2,20000.0);
		cookies.put(p3,15000.0);
		
		Product ps = new Product("TV", 900.00);
		
		System.out.println("Contains 'ps' key: " + cookies.containsKey(ps));
	}

}
