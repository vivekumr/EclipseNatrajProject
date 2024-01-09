package java8Feature;

public class Product {
	public Integer id;
	public String name;
	public String category;
	public Integer price;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Product(Integer id, String name, String category, Integer price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}
	
	

}
