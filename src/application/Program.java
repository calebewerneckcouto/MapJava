package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String,String> cookies = new TreeMap<>();
		
		
		cookies.put("username", "Calebe");
		cookies.put("email", "calebewerneck@hotmail.com");
		cookies.put("phone","99912213513");
		
		cookies.remove("email");
		cookies.put("phone","123456789"); // atualiza dados pois nao aceita repetição
		
		System.out.println("Contains 'phone' key:  " + cookies.containsKey("phone"));
		System.out.println("Phone Number: " + cookies.get("phone"));
		System.out.println("Size: " + cookies.size());
		System.out.println("ALL COOKIES");
		
		for(String key: cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}

	}

}
