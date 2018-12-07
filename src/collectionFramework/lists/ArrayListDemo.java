package collectionFramework.lists;

import java.util.ArrayList;
import java.util.Iterator;

/*
	Early classes of the Java API, such as Vector, Hashtable and StringBuffer, 
	were synchronized to make them thread-safe. 
	Unfortunately, synchronization has a big negative impact on performance, 
	even when using these collections from a single thread.

	It is better to use their new unsynchronized replacements:
	ArrayList or LinkedList instead of Vector
	Deque instead of Stack
	HashMap instead of Hashtable
	StringBuilder instead of StringBuffer
*/

public class ArrayListDemo {

	public static void main(String[] args) {

		// ArrayList is better for reads
		// LinkedList is better for modifications
		// Vector is threadsafe

		ArrayList<String> list = new ArrayList<>();
		// Creating arraylist
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");

		// Traversing list through Iterator
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("=============================");

		ArrayListing obj = new ArrayListing();
		obj.addToList();
		obj.displayList();
		obj.displayWithForLoop();
	}
}

class ArrayListing {

	ArrayList<String> al;
	Iterator<String> itr;

	ArrayListing() {

	}

	void addToList() {
		al = new ArrayList<>();// creating arraylist

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
