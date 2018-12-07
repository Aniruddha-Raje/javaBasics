package basics.serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
If a class implements Serializable then all its sub classes will also be serializable.
If there is any static or transient data member in a class, 
it will not be serialized because static is the part of class not object.
*/

class Person implements Serializable{  
	 int id;  
	 String name;  
	 
	 Person(int id, String name) {  
		 this.id = id;  
		 this.name = name;  
	 }  
} 

class CollegeStudent extends Person{  
	 String course;  
	 int fee;  
	 
	 public CollegeStudent(int id, String name, String course, int fee) {  
		 super(id,name);  
		 this.course=course;  
		 this.fee=fee;  
	 }  
}  


public class InheritSerializable {
	public static void main(String[] args) {
		CollegeStudent s1 =new CollegeStudent(211,"ravi", "MBA", 50000); 
		
		try {
			FileOutputStream fout = new FileOutputStream("f.txt");  
			ObjectOutputStream out = new ObjectOutputStream(fout);  
			  
			out.writeObject(s1);  
			out.flush();  
			System.out.println("success");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
