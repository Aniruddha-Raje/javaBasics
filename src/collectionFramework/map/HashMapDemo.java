package collectionFramework.map;

import java.util.*;

public class HashMapDemo {
	public static void main(String args[]) {

		//Map keys must be unique
		//HashMap is unordered and unsorted, allows one null key
		//LinkedHashMap is ordered by entries
		//TreeMap is ordered and sorted, do not allow null key
		
		//HashTable is similar to HashMap but syncronized, does not allow null key and is legacy
		//ConcurrentHashMap's segments are independently syncronized/locked 
		//vs SyncronizedMap lock is applied on whole Map(Class/Object)
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(100, "Bhagyesha");
		hashMap.put(101, "Shweta");
		hashMap.put(102, "Pranjali");
		hashMap.put(103, "Pooja");
		hashMap.put(104, "Sayali");
		hashMap.put(105, "Renuka");
		hashMap.put(106, "Mrunmai");
		hashMap.put(107, "Anuja");
		hashMap.put(108, "Sonam");

		// Printing the Hash Map object
		System.out.println(hashMap);

		// Removing an element
		hashMap.remove(107);

		// Printing using the Hash Map key
		System.out.println(hashMap.get(101));

		// Looping through
		for (Map.Entry m : hashMap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
