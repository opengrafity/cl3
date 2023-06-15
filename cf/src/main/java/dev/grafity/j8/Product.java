package dev.grafity.j8;

public class Product implements Comparable<Product> {
	private Integer prodId;
	private String prodName;
	private Double prodPrice;
	private String category;
	
	public Product() {
		super();
	}
	public Product(Integer prodId, String prodName, Double prodPrice, String  category) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.category = category;
	}
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(Double prodPrice) {
		this.prodPrice = prodPrice;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodPrice=" + prodPrice + ", category="
				+ category + "]";
	}
	@Override
	public int compareTo(Product that) {
		return Integer.compare(this.getProdId(), that.getProdId());
	}
}
