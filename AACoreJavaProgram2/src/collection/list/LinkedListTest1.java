package collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest1 {
//https://www.javatpoint.com/java-linkedlist
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		
		ll.add("Raj");
		ll.add("kumar");
		ll.add("Mango");    
	    ll.add("Apple");    
	    ll.add("Banana");    
	    ll.add("Grapes");
	    System.out.println("====without iterator=======");
	    System.out.println(ll);
	   
	    System.out.println("====using iterator=======");

	    Iterator<String> itr=ll.iterator();
	    while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
