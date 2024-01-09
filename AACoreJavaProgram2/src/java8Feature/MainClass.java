package java8Feature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {
		
		Product p1=new Product(10, "Spring", "Book", 789);
		Product p2=new Product(11, "Java", "Book", 800);
		Product p3=new Product(12, "Lemon", "Fruit", 9);
		Product p4=new Product(13, "DSA", "Book", 900);
		Product p5=new Product(14, "Hibernate", "Book", 600);
		
		List<Product> products=Arrays.asList(p1,p2,p3,p4,p5);
		
		products.stream().filter(p->p.getCategory().equalsIgnoreCase("Book")).filter(p->p.getPrice()>600).collect(Collectors.toList()).forEach(System.out :: println);
		
		
	}

}
