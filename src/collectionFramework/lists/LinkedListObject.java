package collectionFramework.lists;

import java.util.*;  

class LinkedListBook {  
int id;  
String name,author,publisher;  
int quantity;  
public LinkedListBook(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
}  

public class LinkedListObject {
	public static void main(String[] args) {  
	    //Creating list of Books  
	    List<LinkedListBook> list=new LinkedList<LinkedListBook>();  
	    //Creating Books  
	    LinkedListBook b1=new LinkedListBook(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    LinkedListBook b2=new LinkedListBook(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    LinkedListBook b3=new LinkedListBook(103,"Operating System","Galvin","Wiley",6);  
	    //Adding Books to list  
	    list.add(b1);  
	    list.add(b2);  
	    list.add(b3);  
	    //Traversing list  
	    for(LinkedListBook b:list){  
	    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    }  
	}
}
