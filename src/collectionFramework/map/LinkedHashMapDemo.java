package collectionFramework.map;

import java.util.*;  

public class LinkedHashMapDemo {
	public static void main(String args[]){  
		   
	  LinkedHashMap<Integer,String> linkedHashMap=new LinkedHashMap<Integer,String>();  
	  
	  linkedHashMap.put(100,"Bhagyesha");  
	  linkedHashMap.put(101,"Shweta");  
	  linkedHashMap.put(102,"Pranjali");
	  linkedHashMap.put(103,"Pooja");
	  linkedHashMap.put(104,"Sayali");
	  linkedHashMap.put(105,"Renuka");
	  linkedHashMap.put(106,"Mrunmai");
	  linkedHashMap.put(107,"Anuja");
	  linkedHashMap.put(108,"Sonam");
	  
	  System.out.println("Values before remove: "+linkedHashMap);
	  
	  linkedHashMap.remove(102);
	  
	  System.out.println("Values after remove: "+linkedHashMap);
		  
		for(Map.Entry m:linkedHashMap.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		 }  
	}
}
