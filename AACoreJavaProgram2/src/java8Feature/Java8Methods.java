package java8Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Methods {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(20);
		list1.add(32);
		list1.add(13);
		list1.add(44);
		list1.add(15);
		list1.add(62);
		list1.add(27);
		list1.add(18);
		System.out.println(list1);
		List<Integer> result= list1.stream().map(l->l+10).collect(Collectors.toList());
				//list1.stream().map(l->l+10).collect(Collectors.toList());
		System.out.println("Result "+result);
	}

}
