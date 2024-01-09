package java8Feature;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenNumbers_filter {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		//int sum = numbers.stream().filter(n->n%2==0).mapToInt(Integer :: intValue).sum();
		int sum=numbers.stream().filter(n->n%2==0).mapToInt(Integer :: intValue).sum();
		System.out.println(sum);
	}
}
