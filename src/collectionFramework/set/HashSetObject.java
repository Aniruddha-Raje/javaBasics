package collectionFramework.set;

import java.util.*;  

class HashSetBook {  
int id;  
String name,author,publisher;  
int quantity;  
public HashSetBook(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
}  

public class HashSetObject {
	public static void main(String[] args) {  
	    HashSet<HashSetBook> set=new HashSet<HashSetBook>();  
	    //Creating Books  
	    HashSetBook b1=new HashSetBook(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    HashSetBook b2=new HashSetBook(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    HashSetBook b3=new HashSetBook(103,"Operating System","Galvin","Wiley",6);  
	    //Adding Books to HashSet  
	    set.add(b1);  
	    set.add(b2);  
	    set.add(b3);  
	    //Traversing HashSet  
	    for(HashSetBook b:set){  
	    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    }  
	}  
}
