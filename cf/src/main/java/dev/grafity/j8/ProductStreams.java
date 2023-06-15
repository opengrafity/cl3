package dev.grafity.j8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ProductStreams {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
				
		products.add(new Product(1,"Soap",25.5,"cosmotics"));
		products.add(new Product(2,"Shampoo",4.0,"cosmotics"));
		products.add(new Product(3,"Cream",400.0,"cosmotics"));		
		products.add(new Product(5,"Shirts",1000.0,"clothing"));
		products.add(new Product(6,"Troushers",2000.0,"clothing"));
		products.add(new Product(4,"Perfume",240.0,"cosmotics"));
		products.add(new Product(7,"Grinder",4000.0,"electronics"));		
		products.add(new Product(9,"Monitor",12000.0,"electronics"));
		products.add(new Product(10,"SDD",6000.0,"electronics"));
		products.add(new Product(8,"Mic",14000.0,"electronics"));
		
		products.stream().map(p->p.getProdName().toUpperCase()).filter(name->name.startsWith("S")).forEach(System.out::println);
		System.out.println("By Name");
		products.stream().sorted((first,second)->first.getProdName().compareTo(second.getProdName())).forEach(System.out::println);
		System.out.println("By Price");
		products.stream().sorted((first,second)->Double.compare(first.getProdPrice(), second.getProdPrice())).forEach(System.out::println);
		System.out.println("By Price -> Readymade Comparator");
		products.stream().sorted(Comparator.<Product> comparingDouble(p->p.getProdPrice())).forEach(System.out::println);
		
		 Collector<String, ?, List<String>> listCollector =  Collectors.toList();
		
		List<String> names = products.stream().map(p->p.getProdName()).collect(listCollector);
		
		Map<String, List<Product>> groupedProducts =  products.stream().collect(Collectors.groupingBy(product->product.getCategory()));
		
		System.out.println(groupedProducts);
		
		Map<String,Double> productPrices = products.stream().sorted((one,two)->one.getProdName().compareTo(two.getProdName())).collect(Collectors.toMap(p->p.getProdName(), p->p.getProdPrice()));
		
		System.out.println(productPrices.get("Mic"));
		
		DoubleSummaryStatistics stats = products.stream().collect(Collectors.summarizingDouble(p->p.getProdPrice()));
		
		Map<Boolean,List<Product>> prodGrps = products.stream().collect(Collectors.partitioningBy(p->p.getProdPrice()>10000));
		System.out.println(prodGrps);
		
		System.out.println(stats.getSum());
		
		String value = products.stream().map(p->p.getProdName()).collect(Collectors.joining(";"));
		System.out.println(value);
		
	}
}
