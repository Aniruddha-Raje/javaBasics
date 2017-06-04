package basics.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class TransientStudent implements Serializable{  
	int id;  
	String name;  
	transient int age;//Now it will not be serialized  
	
	public TransientStudent(int id, String name,int age) {  
		this.id = id;  
		this.name = name;  
		this.age=age;  
	}  
}

public class TransientKeyword {
	public static void main(String[] args) {
		TransientStudent s1 =new TransientStudent(211,"ravi",22);//creating object
		
		try {
			//writing object into file  
			FileOutputStream f=new FileOutputStream("f.txt");  
			ObjectOutputStream out=new ObjectOutputStream(f);  
			out.writeObject(s1);  
			out.flush();  
			  
			out.close();  
			f.close();  
			System.out.println("success");  
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
			TransientStudent s=(TransientStudent)in.readObject();  
			System.out.println(s.id+" "+s.name+" "+s.age);  
			in.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
