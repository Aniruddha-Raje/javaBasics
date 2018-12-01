package basics.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//transient keyword is used along with instance variables 
//to exclude them from serialization process. 
//if a field is transient its value will not be persisted.
//transient keyword can not be used along with static keyword 
//but volatile can be used along with static.

class TransientStudent implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1527188310419574723L;

	int id;
	String name;
	transient int age;// Age will not be serialized

	public TransientStudent(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
}

public class TransientKeyword {
	public static void main(String[] args) {

		TransientStudent s1 = new TransientStudent(1, "Aniruddha", 26);// creating object

		try {
			// writing object into file
			FileOutputStream fos = new FileOutputStream("f.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s1);
			oos.flush();

			oos.close();
			fos.close();
			System.out.println("success");
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("f.txt"));
			TransientStudent transientStudent = (TransientStudent) ois.readObject();

			System.out.println(transientStudent.id + " " + transientStudent.name + " " + transientStudent.age);
			ois.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
