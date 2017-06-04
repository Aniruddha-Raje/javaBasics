package collectionFramework.map;

import java.util.*;  

public class TreeMapDemo {
	public static void main(String args[]){  
		  TreeMap<Integer,String> treeMap=new TreeMap<Integer,String>();  
		  treeMap.put(100,"Bhagyesha");  
		  treeMap.put(101,"Shweta");  
		  treeMap.put(102,"Pranjali");
		  treeMap.put(103,"Pooja");
		  treeMap.put(104,"Sayali");
		  treeMap.put(105,"Renuka");
		  treeMap.put(106,"Mrunmai");
		  treeMap.put(107,"Anuja");
		  treeMap.put(108,"Sonam");  
		  
		  for(Map.Entry m:treeMap.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }
		  
		 }
}
