package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayListing obj = new ArrayListing();
		obj.addToList();
		obj.displayList();
		obj.displayWithForLoop();
	}
}

class ArrayListing{
	ArrayList<String> al;
	Iterator itr;
	
	ArrayListing(){
		
	}
	
	void addToList(){
		al=new ArrayList<String>();//creating arraylist
		
		al.add("Aniruddha");//adding object in arraylist  
		al.add("Hitesh");  
		al.add("Rahul");  
		al.add("Kshitij");
	}
	
	void displayList(){
		itr=al.iterator();
		
		while(itr.hasNext()){  
		   System.out.println(itr.next());  
	 	}  
	}
	
	void displayWithForLoop(){
		for(String obj:al)  
		    System.out.println(obj);  
	}
}
