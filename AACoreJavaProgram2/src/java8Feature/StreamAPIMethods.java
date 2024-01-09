package java8Feature;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIMethods {
//Given the list of integers, find the first element of the list using Stream functions?
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		
		//.ifPresent
		System.out.println("First Element");
		myList.stream().findFirst().ifPresent(System.out :: println);
		
		//.collect
		System.out.println("Event Numbers");
		myList.stream().filter(n -> n%2==0).collect(Collectors.toList()).forEach(System.out :: println);
		
		int sum=myList.stream().filter(n -> n%2==0).mapToInt(Integer :: intValue).sum();
		System.out.println("Sum of EVEN Numbers "+sum);
		
		//.count
		long count = myList.stream().count();
		System.out.println("Total Element " + count);
		
		//.max
		Integer integer = myList.stream().max(Integer::compare).get();
		System.out.println("Maximun number " + integer);
		
		Set<Integer> set=new HashSet<Integer>();
		
		Stream<Integer> filter = myList.stream().filter(n -> !set.add(n));
		System.out.println("Duplicate Element Are "+filter.toList());
		
		System.out.println("Non-Duplicate Element Are ");
		myList.stream().filter(n -> set.add(n)).forEach(System.out :: println);
		
		//find out all the numbers starting with 1
		System.out.println("Find out all the numbers starting with 1");
		myList.stream().map(s -> s+"").filter(s -> s.startsWith("1")).collect(Collectors.toList()).forEach(System.out :: println);

	}

}
