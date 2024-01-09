package java8Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStringUsingMap {

	public static void main(String[] args) {
		List<String> fruits=new ArrayList<String>();
		
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("PineApple");
		fruits.add("Grapes");
		
		System.out.println("List of String "+fruits);
		
		fruits.stream().map(f -> f.length()).collect(Collectors.toList()).forEach(System.out :: println);

	}

}
