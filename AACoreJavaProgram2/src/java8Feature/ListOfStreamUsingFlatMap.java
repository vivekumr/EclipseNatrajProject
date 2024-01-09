package java8Feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStreamUsingFlatMap {

	public static void main(String[] args) {
		List<List<Integer>> phoneNumber=new ArrayList<>();
		phoneNumber.add(Arrays.asList(9090,8080));
		phoneNumber.add(Arrays.asList(7070,6060));
		phoneNumber.add(Arrays.asList(5050,4040));
		phoneNumber.add(Arrays.asList(3030,2020));
		
		System.out.println("List of Phone Number "+phoneNumber);
		
		phoneNumber.stream().flatMap(pn -> pn.stream()).collect(Collectors.toList()).forEach(System.out :: println);
		List<Integer> result=phoneNumber.stream().flatMap(pn -> pn.stream()).collect(Collectors.toList());
		System.out.println("Result "+result);

	}
}
