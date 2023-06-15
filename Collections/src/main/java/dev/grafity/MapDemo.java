package dev.grafity;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();
        Map<String,String> ages = new TreeMap<>();
        ages.put("Geetha","9885654856");
        ages.put("Seetha","9440984856");
        ages.put("Kavitha","9440984856");
        ages.put("Navaneetha","8666856566");
        ages.put("Navaneetha","8666859866");
        Set<String> keys = ages.keySet();
        for(String key:keys){
            System.out.println(key+"-->"+ages.get(key));
        }
        Collection<String> numbers = ages.values();
        System.out.println(numbers);
        Set<Map.Entry<String,String>> entries = ages.entrySet();
        for(Map.Entry<String,String> entry :entries){
            System.out.println(entry.getKey() +"<--->"+ entry.getValue());
        }
    }
}
