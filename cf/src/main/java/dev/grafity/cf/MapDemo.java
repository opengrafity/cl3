package dev.grafity.cf;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> properties = new TreeMap<>();
		properties.put("Name","Skillyheads Pvt Ltd");
		properties.put("NOE","2");
		properties.put("Location", "Naidupet");
		properties.put("NOD","2");

		
		String locationValue = properties.get("Location");
		
		System.out.println(locationValue);
		
		Set<String> keys =  properties.keySet();
		System.out.println(keys);
		Collection<String> values = properties.values();
		System.out.println(values);
		
		Set<Map.Entry<String, String>> entries =  properties.entrySet();
		for(Map.Entry<String, String> entry : entries ) {
			System.out.println(entry.getKey()+"<--->"+entry.getValue());
		}
		
	}
}
