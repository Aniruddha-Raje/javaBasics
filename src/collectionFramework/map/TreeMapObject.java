package collectionFramework.map;

import java.util.*;    

class TreeMapBooks {    
int id;    
String name,author,publisher;    
int quantity;    
public TreeMapBooks(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}    
}

public class TreeMapObject {
	public static void main(String[] args) {    
	    //Creating map of Books    
	    Map<Integer,TreeMapBooks> map=new TreeMap<Integer,TreeMapBooks>();    
	    //Creating Books    
	    TreeMapBooks b1=new TreeMapBooks(101,"Let us C","Yashwant Kanetkar","BPB",8);    
	    TreeMapBooks b2=new TreeMapBooks(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    TreeMapBooks b3=new TreeMapBooks(103,"Operating System","Galvin","Wiley",6);    
	    //Adding Books to map   
	    map.put(2,b2);  
	    map.put(1,b1);  
	    map.put(3,b3);  
	      
	    //Traversing map  
	    for(Map.Entry<Integer, TreeMapBooks> entry:map.entrySet()){    
	        int key=entry.getKey();  
	        TreeMapBooks b=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
	    }    
	}
}
