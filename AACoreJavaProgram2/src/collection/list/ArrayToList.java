package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		//creating array
		String[] array= {"Java","Python","PHP","C++"};
		System.out.println("Printing Array"+Arrays.toString(array));
		//converting to ArrayList
		List<String> list=new ArrayList<String>();
		for(String str:array) {
			list.add(str);
		}
		System.out.println("Printing List "+list);
	}
}
