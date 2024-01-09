package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest1 {

	public static void main(String[] args) {
		//https://www.javatpoint.com/java-arraylist
		
		/*
􏰁 Usually we can Use Collections to Hold and Transfer Data (Objects) form One Location to Another Location.
􏰁 To Provide Support for this Requirement Every Collection Class Implements Serializable and Cloneable Interfaces.
􏰁 ArrayList and Vector Classes Implements RandomAccess Interface. So that we can Access any Random Element with the Same Speed.
􏰁 RandomAccess Interface Present in java.util Package and it doesn't contain any Methods. Hence it is a Marker Interface.
􏰁 Hence ArrayList is Best Suitable if Our Frequent Operation is Retrieval Operation.
		 */
		ArrayList<String> list=new ArrayList<String>();
		list.add("Raj");
		list.add("kumar");
		 list.add("Mango");    
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes");
	      list.add(null);
	      System.out.println("======without iterator======");
	      System.out.println(list);
	      
	    //Traversing list through Iterator
	      System.out.println("======using iterator======");
	      Iterator<String> itr=list.iterator();
	      while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	      System.out.println("===========Synchronized version=======");
//	      By Default ArrayList Object is Non - Synchronized but we can get 
	      //Synchronized Version ArrayList Object by using the following Method of Collections Class.
	      List sv=Collections.synchronizedList(list);
	      
	    //Traversing list through for loop
	      System.out.println("======for loop======");
	      for(String lis:list) {
	    	  System.out.println(lis);
	      }

	}

}
