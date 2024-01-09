package java8Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ToUpperCase_map_collect {

	public static void main(String... args) {
		List<String> l= new ArrayList<String>();
		l.add("raj");
		l.add("usha");
		l.add("beauty");
		l.add("add");
		l.add("sugana");
		List<String> collect = l.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println("Result "+ collect);
	}
}
