package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_Sort {

	public static void main(String [] args) {
		
		ArrayList<String> list1=new ArrayList<String>();
		
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Grapes");
		list1.add("Pineapple");
		
		Collections.sort(list1);
		
		Iterator<String> itr1=list1.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		
		list2.add(90);
		list2.add(5);
		list2.add(43);
		list2.add(87);
		list2.add(2);
		
		Collections.sort(list2);
		
		Iterator<Integer> itr2=list2.iterator();
		
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
