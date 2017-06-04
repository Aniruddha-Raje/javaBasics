package basics.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{  
	int id;  
	String name;  
	
	Student(int id, String name) {  
		this.id = id;  
		this.name = name;  
	 }  
}

public class SerializableDemo {
	public static void main(String[] args) {
		
		Student s1 =new Student(211,"ravi"); 
		
		try {
			FileOutputStream fout = new FileOutputStream("f.txt");  
			ObjectOutputStream out = new ObjectOutputStream(fout);  
			  
			out.writeObject(s1);  
			out.flush();  
			System.out.println("success");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
			Student s=(Student)in.readObject();  
			System.out.println(s.id+" "+s.name);  
			  
			in.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
