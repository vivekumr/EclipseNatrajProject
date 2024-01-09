package collection.list;

import java.util.LinkedList;

public class LinkedListTest3Remove {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();  
        ll.add("Ravi");  
        ll.add("Vijay");  
        ll.add("Ajay");  
        ll.add("Anuj");  
        ll.add("Gaurav");  
        ll.add("Harsh");  
        ll.add("Virat");  
        ll.add("Gaurav");  
        ll.add("Harsh");  
        ll.add("Amit"); 
        System.out.println("Initial list of elements: "+ll);  
        ll.remove("Vijay");
        System.out.println("After invoking remove(object) method: "+ll);
        ll.remove(0);
        System.out.println("After invoking remove(index) method: "+ll);
        LinkedList<String> ll2=new LinkedList<String>();  
        ll2.add("Ravi");  
        ll2.add("Hanumat"); 
        // Adding new elements to arraylist  
        ll.addAll(ll2); 
        System.out.println("Updated list : "+ll);
      //Removing first element from the list 
        ll.removeFirst();
        System.out.println("After removing first element from the list : "+ll);
      //Removing last element from the list  
        ll.removeLast();
        System.out.println("After removing last element from the list : "+ll);
      //Removing first occurrence of element from the list  
        ll.removeFirstOccurrence("Gaurav");
        System.out.println("After invoking removeFirstOccurrence() method: "+ll); 
      //Removing Last occurrence of element from the list  
        ll.removeLastOccurrence("Harsh");
        System.out.println("After invoking removeLastOccurrence() method: "+ll);  
      }

}
