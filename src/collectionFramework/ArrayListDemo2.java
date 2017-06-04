package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Student s1=new Student(101,"Sonoo",23);  
		Student s2=new Student(102,"Ravi",21);  
		Student s3=new Student(103,"Hanumat",25);
		
		ArrayList<Student> al=new ArrayList<Student>();//creating arraylist  
		  al.add(s1);//adding Student class object  
		  al.add(s2);  
		  al.add(s3);  
		    
		  Iterator itr=al.iterator();  
		  //traversing elements of ArrayList object  
		  while(itr.hasNext()){  
		    Student st=(Student)itr.next();  
		    System.out.println(st.rollno+" "+st.name+" "+st.age);  
		  }  
	}

}

class Student{  
	  
	int rollno;  
	String name;  
	int age;
	  
	Student(int rollno,String name,int age){  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	  }  
}  