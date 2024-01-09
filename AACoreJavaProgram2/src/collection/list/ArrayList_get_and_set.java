package collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_get_and_set {

	public static void main(String[] args) {
		
		ArrayList<String> lists=new ArrayList<String>();
		
		lists.add("mina");
		lists.add("raj");
		lists.add("apple");
		lists.add("mango");
		lists.add("nvl");
		
		System.out.println("Getting the element from list :: "+lists.get(1));//it will return the 2nd element, because index starts from 0  
		
		lists.set(1, "grapes");
		
		Iterator<String> itr=lists.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}

	}

}
