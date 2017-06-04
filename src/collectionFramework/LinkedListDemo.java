package collectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo{

	public static void main(String[] args) {
		
		Demo obj = new Demo();
		
		obj.addToList();
		obj.displayList();
	}

}

class Demo{
	
	LinkedList<String> al;
	Iterator<String> itr;  

	Demo(){
		al = new LinkedList<String>();
		
	}
	
	void addToList(){
		  al.add("Aniruddha");  
		  al.add("Hitesh");  
		  al.add("Rahul");  
		  al.add("Kshitij");  
	}
	
	void displayList(){
		
		itr = al.iterator();
		
	    while(itr.hasNext()){  
	           System.out.println(itr.next());  
	    }
	}
}