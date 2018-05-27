package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		//ArrayList is better for reads
		//LinkedList is better for modifications
		//Vector is threadsafe
		
		ArrayListing obj = new ArrayListing();
		obj.addToList();
		obj.displayList();
		obj.displayWithForLoop();
	}
}

class ArrayListing {
	
	ArrayList<String> al;
	Iterator itr;

	ArrayListing() {

	}

	void addToList() {
		al = new ArrayList<String>();// creating arraylist

		al.add("Aniruddha");// adding object in arraylist
		al.add("Hitesh");
		al.add("Rahul");
		al.add("Kshitij");
	}

	void displayList() {
		itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		for (String temp : al) {
			System.out.println(temp);
		}
	}

	void displayWithForLoop() {
		for (String obj : al)
			System.out.println(obj);
	}
}
