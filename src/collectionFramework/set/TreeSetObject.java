package collectionFramework.set;

import java.util.*;  

class TreeSetBook implements Comparable<TreeSetBook>{  
int id;  
String name,author,publisher;  
int quantity;  
public TreeSetBook(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
public int compareTo(TreeSetBook b) {  
    if(id>b.id){  
        return 1;  
    }else if(id<b.id){  
        return -1;  
    }else{  
    return 0;  
    }  
}  
} 

public class TreeSetObject {
	public static void main(String[] args) {  
	    Set<TreeSetBook> set=new TreeSet<TreeSetBook>();  
	    //Creating Books  
	    TreeSetBook b1=new TreeSetBook(121,"Let us C","Yashwant Kanetkar","BPB",8);  
	    TreeSetBook b2=new TreeSetBook(233,"Operating System","Galvin","Wiley",6);  
	    TreeSetBook b3=new TreeSetBook(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    //Adding Books to TreeSet  
	    set.add(b1);  
	    set.add(b2);  
	    set.add(b3);  
	    //Traversing TreeSet  
	    for(TreeSetBook b:set){  
	    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    }  
	} 
}
