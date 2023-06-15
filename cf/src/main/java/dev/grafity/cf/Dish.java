package dev.grafity.cf;

import java.util.Objects;

public class Dish implements Comparable<Dish>{
	private String name;
	private double price;
	private String cuisineName;
	private String type;

	public Dish() {
		super();
	}

	public Dish(String name, double price, String cuisineName, String type) {
		super();
		this.name = name;
		this.price = price;
		this.cuisineName = cuisineName;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCuisineName() {
		return cuisineName;
	}

	public void setCuisineName(String cuisineName) {
		this.cuisineName = cuisineName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cuisineName, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dish other = (Dish) obj;
		return Objects.equals(cuisineName, other.cuisineName) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Dish [name=" + name + ", price=" + price + ", cuisineName=" + cuisineName + ", type=" + type + "]";
	}

	@Override
	public int compareTo(Dish o) {
		if(this.name.compareTo(o.name)==0) {
			return Double.compare(this.price, o.price);
		}
		return this.name.compareTo(o.name);
	}


}
