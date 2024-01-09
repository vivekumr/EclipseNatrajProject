package collection.list;

import java.util.LinkedList;

public class LinkedListTest2 {

	public static void main(String[] args) {
	//different ways to add element in linked arraylist
		LinkedList<String> ll=new LinkedList<String>();  
        System.out.println("Initial list of elements: "+ll);  
        ll.add("Ravi");  
        ll.add("Vijay");  
        ll.add("Ajay");  
        System.out.println("After invoking add(E e) method: "+ll);  
        //Adding an element at the specific position  
        ll.add(1, "Gaurav");
        System.out.println("After invoking add(int index, E element) method: "+ll);
        LinkedList<String> ll2=new LinkedList<String>();  
        ll2.add("Sonoo");  
        ll2.add("Hanumat");  
        LinkedList<String> ll3=new LinkedList<String>();
        ll3.add("John");  
        ll3.add("Rahul");  
        //Adding second list elements to the first list at specific position  
        ll.addAll(1, ll3);    
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+ll);  
        //Adding an element at the first position  
        ll.addFirst("Rajesh");
        System.out.println("After invoking addFirst(E e) method: "+ll);  
        //Adding an element at the last position  
        ll.addLast("Harsh");  
        System.out.println("After invoking addLast(E e) method: "+ll);  

	}

}
