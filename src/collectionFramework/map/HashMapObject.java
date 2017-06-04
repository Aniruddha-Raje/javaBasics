package collectionFramework.map;

import java.util.*;    

class HashMapBooks {
	int id;    
	String name,author,publisher;    
	int quantity;
	
	public HashMapBooks(int id, String name, String author, String publisher, int quantity) {    
	    this.id = id;    
	    this.name = name;    
	    this.author = author;    
	    this.publisher = publisher;    
	    this.quantity = quantity;    
	}    
}   

public class HashMapObject {
	public static void main(String[] args) {
		
	    //Creating map of Books    
	    Map<Integer,HashMapBooks> map=new HashMap<Integer,HashMapBooks>();
	    
	    //Creating Books    
	    HashMapBooks b1=new HashMapBooks(101,"Let us C","Yashwant Kanetkar","BPB",8);
	    HashMapBooks b2=new HashMapBooks(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    HashMapBooks b3=new HashMapBooks(103,"Operating System","Galvin","Wiley",6);
	    
	    //Adding Books to map   
	    map.put(1,b1);  
	    map.put(2,b2);  
	    map.put(3,b3);  
	      
	    //Traversing map  
	    for(Map.Entry<Integer, HashMapBooks> entry:map.entrySet()){    
	        int key=entry.getKey();
	        HashMapBooks b=entry.getValue();
	        
	        System.out.println(key+" Details:");
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
	    }    
	}   
}
