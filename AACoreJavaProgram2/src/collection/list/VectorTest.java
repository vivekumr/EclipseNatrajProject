package collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
//https://www.javatpoint.com/difference-between-arraylist-and-vector
		 Vector<String> v=new Vector<String>();//creating vector  
		  v.add("umesh");//method of Collection  
		  
		  v.addElement("irfan");//method of Vector  
		  v.addElement("kumar");  
		  //traversing elements using Enumeration  
		  Enumeration e=v.elements();  
		  while(e.hasMoreElements()){  
		   System.out.println(e.nextElement());  
		  }  
	}

}
